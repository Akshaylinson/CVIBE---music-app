# CVIBE

**Your music. Your vibe.**

CVIBE is a free and open-source music client for Android and desktop, built by Codeless Technologies. It provides a clean way to discover, organise, and play music from YouTube Music across Android, Windows, macOS, and Linux.

> CVIBE is an independent project. It is not affiliated with, endorsed by, or connected to YouTube, Google, Spotify, or Apple.

## Website and downloads

- Website: [cvibe.codelessai.in](https://cvibe.codelessai.in)
- Releases: [GitHub Releases](https://github.com/Akshaylinson/CVIBE---music-app/releases)

When a release is published, the website detects the latest platform asset and offers a direct browser download.

## Highlights

- Background playback and media controls
- Search, albums, artists, playlists, podcasts, charts, and moods
- Synced and word-by-word lyrics, including romanisation support
- Offline caching and smart downloads on Android
- Ten-band equalizer, AutoEq profiles, crossfade, delay, and reverb
- Listening analytics, history, listening clock, and receipt sharing
- SponsorBlock, Return YouTube Dislike, and Last.fm scrobbling support
- Android Auto, Discord Rich Presence, and Listen Together rooms
- Playlist and account synchronisation when signed in
- Desktop support for Windows, macOS, and Linux

## Supported platforms

| Platform | Supported builds |
| --- | --- |
| Android | Android 8.0+ |
| Windows | Windows 10/11 (x64) |
| macOS | macOS 15+ on Intel and Apple Silicon |
| Linux | x64 AppImage |

## Downloading a release

Use the [CVIBE website](https://cvibe.codelessai.in) or the repository's [Releases page](https://github.com/Akshaylinson/CVIBE---music-app/releases).

Release assets use these formats:

- Android: `.apk`
- Windows: `.msix`, `.msi`, or `.exe`
- macOS: `.zip`, `.dmg`, or `.pkg`
- Linux: `.AppImage`, `.deb`, `.rpm`, or `.tar.gz`

Android, Windows, and macOS may show their normal operating-system safety prompts for unsigned or newly signed software. Only download files from the official release page.

## Development setup

### Prerequisites

- JDK 21 for desktop development
- Android SDK and an Android device or emulator for Android development
- Android Studio is recommended
- Conveyor CLI for desktop packaging

Clone the repository and initialise the Gradle wrapper:

```bash
git clone https://github.com/Akshaylinson/CVIBE---music-app.git
cd CVIBE---music-app
./gradlew tasks
```

### Android

Build a local debug APK with:

```bash
./gradlew :androidApp:assembleDebug
```

For a signed release APK, use the repository script after configuring a production keystore and the required environment variables:

```bash
export KEYSTORE_PASSWORD='...'
export KEY_PASSWORD='...'
export KEY_ALIAS='...'

./build_and_sign_apk.sh --full --release
```

Never commit your keystore or its passwords. The script expects the keystore path configured in `build_and_sign_apk.sh`.

### Desktop packages

The desktop module provides these packaging tasks:

```bash
# Linux x64 AppImage
./gradlew :desktopApp:buildLinuxAppImage --no-configuration-cache

# macOS Intel and Apple Silicon ZIP packages
./gradlew :desktopApp:buildMacZipAmd64 --no-configuration-cache
./gradlew :desktopApp:buildMacZipAarch64 --no-configuration-cache

# Windows x64 MSIX package
./gradlew :desktopApp:buildWindowsMsix --no-configuration-cache
```

Build and test each package on its target operating system before publishing it. Production Windows and macOS releases should be code-signed; macOS releases should also be notarized.

### Website

The static marketing site lives in [`docs/`](docs/). Preview it locally with:

```bash
python3 -m http.server 8000 --directory docs
```

Then open `http://localhost:8000`.

The GitHub Pages deployment workflow is in [`.github/workflows/deploy-pages.yml`](.github/workflows/deploy-pages.yml). In repository **Settings → Pages**, select **GitHub Actions** as the publishing source. The production custom domain is `cvibe.codelessai.in`.

## Project structure

```text
androidApp/    Android application
composeApp/    Shared Kotlin Multiplatform UI and application code
desktopApp/    Desktop entry point and packaging tasks
core/          Media, playback, and supporting modules
docs/          CVIBE landing page and GitHub Pages content
```

## Privacy and content

CVIBE does not host audio or video files. Content is accessed from third-party services and remains subject to their terms and the laws that apply to the user. Users are responsible for using the software lawfully and respecting artists, rights holders, and platform terms.

Some optional features may require signing in to third-party services or supplying your own API credentials. Review the source and app settings before enabling them.

## Contributing

Contributions, bug reports, and documentation improvements are welcome. Please open an issue to discuss significant changes before submitting a pull request. Keep changes focused, test the affected platform, and do not commit secrets, signing keys, or generated release binaries.

## License and acknowledgements

CVIBE is licensed under the [GNU General Public License v3.0](LICENSE).

This project is derived from and builds upon the open-source [SimpMusic](https://github.com/maxrave-dev/SimpMusic) project. Please retain applicable upstream copyright notices and comply with the GPL-3.0 when redistributing modified versions.
