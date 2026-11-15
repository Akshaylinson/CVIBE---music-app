// Auto-update footer year
const yearEl = document.getElementById('footer-year');
if (yearEl) yearEl.textContent = new Date().getFullYear();

// GitHub Releases is the static site's release backend: the public API returns the current
// release and its downloadable assets with CORS enabled, so GitHub Pages needs no server code.
const RELEASE_REPOSITORY = 'Akshaylinson/CVIBE---music-app';
const RELEASES_PAGE = `https://github.com/${RELEASE_REPOSITORY}/releases`;
const LATEST_RELEASE_API = `https://api.github.com/repos/${RELEASE_REPOSITORY}/releases/latest`;

const platformMatchers = {
  android: (name) => name.endsWith('.apk'),
  windows: (name) => name.endsWith('.exe') || name.endsWith('.msi'),
  macos: (name) => name.endsWith('.dmg') || name.endsWith('.pkg'),
  linux: (name) => name.endsWith('.appimage') || name.endsWith('.deb') || name.endsWith('.rpm') || name.endsWith('.tar.gz'),
};

const platformLabels = {
  android: 'Download APK',
  windows: 'Download installer',
  macos: 'Download DMG',
  linux: 'Download for Linux',
};

function assetScore(platform, name) {
  if (platform === 'android') {
    if (name.includes('universal')) return 3;
    if (name.includes('arm64-v8a') || name.includes('arm64')) return 2;
  }
  if (platform === 'linux' && name.endsWith('.appimage')) return 2;
  return 1;
}

function formatBytes(bytes) {
  if (!Number.isFinite(bytes) || bytes <= 0) return '';
  const units = ['B', 'KB', 'MB', 'GB'];
  const index = Math.min(Math.floor(Math.log(bytes) / Math.log(1024)), units.length - 1);
  return `${(bytes / (1024 ** index)).toFixed(index === 0 ? 0 : 1)} ${units[index]}`;
}

function setPlatformDownload(platform, asset, releaseUrl) {
  const button = document.querySelector(`[data-download-platform="${platform}"]`);
  const meta = document.querySelector(`[data-download-meta="${platform}"]`);
  if (!button || !meta) return;

  if (!asset) {
    button.href = releaseUrl;
    button.textContent = 'View release files';
    meta.textContent = 'Not included in this release';
    return;
  }

  button.href = asset.browser_download_url;
  button.textContent = platformLabels[platform];
  meta.textContent = `${asset.name}${asset.size ? ` · ${formatBytes(asset.size)}` : ''}`;
}

async function loadReleaseDownloads() {
  const status = document.getElementById('release-status');
  try {
    const response = await fetch(LATEST_RELEASE_API, {
      headers: { Accept: 'application/vnd.github+json' },
    });
    if (!response.ok) throw new Error(`GitHub Releases returned ${response.status}`);

    const release = await response.json();
    const releaseUrl = release.html_url || RELEASES_PAGE;
    const assets = Array.isArray(release.assets) ? release.assets : [];
    Object.keys(platformMatchers).forEach((platform) => {
      const asset = assets
        .filter((candidate) => platformMatchers[platform](candidate.name.toLowerCase()))
        .sort((a, b) => assetScore(platform, b.name.toLowerCase()) - assetScore(platform, a.name.toLowerCase()))[0];
      setPlatformDownload(platform, asset, releaseUrl);
    });

    const published = release.published_at ? new Date(release.published_at).toLocaleDateString() : null;
    status.textContent = `Latest release: ${release.name || release.tag_name}${published ? ` · Published ${published}` : ''}`;
  } catch (error) {
    Object.keys(platformMatchers).forEach((platform) => setPlatformDownload(platform, null, RELEASES_PAGE));
    status.textContent = 'No published CVIBE release is available yet. Visit the releases page for updates.';
    console.warn('Unable to load the latest CVIBE release:', error);
  }
}

loadReleaseDownloads();

// Highlight active nav link on scroll
const sections = document.querySelectorAll('section[id]');
const navLinks = document.querySelectorAll('.nav-links a');

const observer = new IntersectionObserver((entries) => {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
      navLinks.forEach(a => {
        a.style.color = a.getAttribute('href') === '#' + entry.target.id
          ? 'var(--ink)'
          : '';
      });
    }
  });
}, { rootMargin: '-40% 0px -55% 0px' });

sections.forEach(s => observer.observe(s));

// Close other open FAQ items when one opens
document.querySelectorAll('.faq-item').forEach(item => {
  item.addEventListener('toggle', () => {
    if (item.open) {
      document.querySelectorAll('.faq-item[open]').forEach(other => {
        if (other !== item) other.removeAttribute('open');
      });
    }
  });
});
