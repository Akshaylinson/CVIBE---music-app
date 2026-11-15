# PROJECT AUDIT & WHITE-LABEL FEASIBILITY STUDY
## SimpMusic → CVIBE by Codeless Technologies

### 1. Project Background

We are evaluating the possibility of white-labeling the existing open-source repository:

https://github.com/maxrave-dev/SimpMusic

Our intention is to create a personally branded music application called **CVIBE**, under our company identity:

**CVIBE — By Codeless Technologies**

CVIBE will retain the original SimpMusic application's functionality, architecture, integrations, and user experience wherever possible.

This is NOT a request to develop a new music application from scratch.

This is NOT a request to replace the existing music playback engine, YouTube Music integration, authentication system, account management, playlist functionality, or other existing features.

Our primary objective is to rebrand the existing application across its supported platforms while preserving its original capabilities.

We want to support:

1. Android mobile application.
2. Desktop application (Windows, macOS and Linux, according to actual repository support).
3. A modern, responsive public landing website for CVIBE.
4. Platform-specific application download options on the landing website.

### 2. Your Role

Act as a Senior Software Architect, Kotlin/Android Developer, Compose Multiplatform Developer, Desktop Application Engineer, Web Developer, and Open-Source Licensing Analyst.

You must conduct a comprehensive technical investigation of the entire repository before making any implementation recommendations.

Do not make assumptions based solely on the README.

Inspect the actual source code, project modules, configuration files, build scripts, dependencies, assets, and platform-specific implementations.

### 3. STRICT INVESTIGATION-ONLY MODE

IMPORTANT: At this stage, DO NOT MODIFY THE REPOSITORY.

Do not:
- Rename application packages.
- Change application IDs.
- Replace application logos.
- Modify source code.
- Remove features.
- Change dependencies.
- Modify authentication.
- Change YouTube Music integrations.
- Change playback logic.
- Change database schemas.
- Change API endpoints.
- Modify desktop or mobile configurations.
- Create the landing page yet.
- Generate or replace APKs or desktop installers.

Your task is to understand the entire project and prepare a technical white-label feasibility report.

All findings must be supported by actual repository files, code references, or official documentation.

Clearly distinguish verified facts from assumptions and recommendations.

---

# SECTION A — COMPLETE REPOSITORY ARCHITECTURE ANALYSIS

### 4. Repository Structure

Inspect the complete repository structure.

Identify:

- All top-level directories.
- Android application modules.
- Shared application modules.
- Desktop application modules.
- Core libraries.
- Music playback modules.
- Media integration modules.
- Authentication modules.
- Networking modules.
- Database modules.
- UI and design modules.
- Configuration files.
- Build and deployment configurations.
- Third-party integrations.
- Git submodules.
- External dependencies.

For every important module, explain:

1. Its purpose.
2. Its responsibilities.
3. Its dependencies.
4. Whether it needs modifications for white-labeling.
5. Whether it must remain completely untouched.

Create a module-by-module architecture table.

### 5. Technology Stack

Identify the actual technologies used.

Investigate:

- Kotlin version.
- Gradle version.
- Compose Multiplatform version.
- Android SDK requirements.
- JVM requirements.
- Media3 / ExoPlayer version.
- Dependency injection framework.
- Database technology.
- Networking libraries.
- Serialization libraries.
- Image-loading libraries.
- Authentication mechanisms.
- Music streaming integrations.
- Desktop packaging technologies.
- Build and release tools.

Do not rely on previously documented assumptions. Verify versions from the repository.

### 6. Application Architecture

Explain the complete application architecture.

Investigate:

- MVVM implementation.
- Clean Architecture layers.
- Repository pattern.
- ViewModels.
- Data sources.
- Domain models.
- Database repositories.
- State management.
- Navigation.
- Dependency injection.
- Shared code between Android and desktop.

Provide a Mermaid architecture diagram.

Identify which components are shared and which are platform-specific.

---

# SECTION B — COMPLETE EXISTING FEATURE AUDIT

### 7. Music and Streaming Functionality

Identify and document every existing music-related feature.

Investigate:

- YouTube Music integration.
- YouTube integration.
- Music search.
- Song metadata retrieval.
- Artist search.
- Album browsing.
- Playlist browsing.
- Playlist creation.
- Playlist management.
- Music recommendations.
- Music charts.
- Genre and mood discovery.
- Radio stations.
- Background playback.
- Queue management.
- Playback controls.
- Audio streaming and caching.
- Offline playback.
- Playback history.
- Listening statistics.

For each feature, identify the exact module, implementation location, and relevant dependencies.

### 8. Authentication and User Management

Understand the existing authentication system completely.

Investigate:

- Login methods.
- YouTube account integration.
- Google account integration.
- Session management.
- Cookie management.
- Token storage.
- Account switching.
- User preferences.
- Synchronization.
- Logout behaviour.

IMPORTANT:

We want to retain the existing authentication and login experience.

Do not propose replacing the existing authentication system with Firebase, Supabase, Auth0, or a custom authentication backend unless there is an independently verified technical necessity.

### 9. Audio Player and Advanced Features

Inspect the implementation of:

- Media playback engine.
- Equalizer.
- Audio effects.
- Crossfade.
- Audio output routing.
- Sleep timer.
- Lyrics synchronization.
- Lyrics translation.
- Offline caching.
- Android Auto.
- Google Cast.
- Discord Rich Presence.
- SponsorBlock.
- Return YouTube Dislike.
- Listen Together.
- Desktop playback integration.
- Widgets.
- Notification controls.
- Headphone and Bluetooth integration.

Document which features are available on Android, desktop, or both.

### 10. AI and Analytics Features

Investigate all existing AI and analytics capabilities.

Identify:

- AI music recommendations.
- AI music taste analysis.
- AI lyrics translation.
- Listening history.
- Monthly and yearly recaps.
- Music statistics.
- Listening-time analytics.
- Artist and genre analytics.
- Spotify-related integrations.
- External AI API requirements.

Identify whether API keys are user-configurable or developer-configured.

Do not introduce additional AI functionality.

---

# SECTION C — WHITE-LABEL FEASIBILITY

### 11. Can the Entire Application Be White-Labelled?

Determine whether the complete existing application can be rebranded as CVIBE without affecting its original functionality.

Investigate all branding-related locations, including:

- Application name.
- Android application ID.
- Desktop application name.
- Desktop package identifiers.
- Launcher icons.
- Adaptive icons.
- Splash screens.
- App logos.
- In-app logos.
- About page.
- Settings page.
- Developer information.
- Copyright information.
- Application metadata.
- Notifications.
- Desktop window titles.
- Installer names.
- App store metadata.
- Website links.
- Documentation links.
- Repository references.
- Hardcoded SimpMusic references.
- Package names and namespaces.

Identify every location where the original branding is embedded.

Provide actual file paths and relevant source-code references.

### 12. White-Label Modification Matrix

Create a detailed table:

| Component | Existing implementation | Proposed CVIBE branding | File path | Risk | Modification required |
|---|---|---|---|---|---|

Categorize each change into:

- Branding-only changes.
- Build configuration changes.
- Platform-specific changes.
- Optional changes.
- Changes that should NOT be performed.

### 13. Package and Application Identity

Investigate how application identity is configured for each platform.

For Android:
- applicationId.
- namespace.
- Manifest.
- Deep links.
- Intent filters.
- File providers.
- Permissions.
- App signing.
- Internal package references.

For desktop:
- Application name.
- Main class.
- JVM entry point.
- Package configuration.
- Installer configuration.
- Executable naming.
- Windows installer.
- macOS application bundle.
- Linux package configuration.

Determine the safest approach to changing application identity without breaking existing integrations.

### 14. Original Features Must Be Preserved

This is a mandatory requirement.

The following rule applies throughout the entire project:

**Do not remove, replace, simplify, disable, or redesign any existing core functionality.**

We want to preserve:

- Existing login.
- Existing user accounts.
- Existing YouTube Music integration.
- Existing music streaming.
- Existing search.
- Existing playlists.
- Existing playback.
- Existing audio effects.
- Existing lyrics.
- Existing caching.
- Existing synchronization.
- Existing analytics.
- Existing AI features.
- Existing desktop functionality.
- Existing Android functionality.

The goal is to change the identity, not rebuild the application.

Identify potential regressions caused by branding changes and explain how to avoid them.

---

# SECTION D — PLATFORM SUPPORT AND RELEASE ANALYSIS

### 15. Android Application

Investigate:

- Supported Android versions.
- Minimum SDK.
- Target SDK.
- Build variants.
- FOSS and Full variants.
- APK generation.
- AAB generation.
- Signing requirements.
- Debug and release configurations.
- Permissions.
- Background service behaviour.
- Platform-specific integrations.

Determine exactly how to generate a CVIBE-branded Android release without removing existing features.

### 16. Desktop Application

Investigate actual support for:

- Windows.
- macOS.
- Linux.

For each platform, document:

- Build requirements.
- Supported architecture.
- Required JDK.
- Packaging tools.
- Installer formats.
- Runtime dependencies.
- Application icons.
- Desktop-specific integrations.
- Release procedures.

Determine whether desktop and Android can share a common branding configuration.

Do not assume every platform is fully supported just because a module exists.

### 17. Unified Release Strategy

Recommend how to maintain:

- CVIBE Android APK.
- CVIBE Android AAB, if appropriate.
- CVIBE Windows installer.
- CVIBE macOS installer.
- CVIBE Linux package.

Explain how all builds can use consistent branding while preserving platform-specific functionality.

---

# SECTION E — CVIBE LANDING WEBSITE

### 18. Landing Website Requirements

We also need a separate public-facing landing website for CVIBE.

This website is independent of the music application.

It must introduce CVIBE to visitors and provide download options for supported devices.

The landing page should have a modern, premium, professional visual identity.

Branding:

- Product name: CVIBE.
- Company: Codeless Technologies.
- Tagline: Your Music. Your Vibe.
- Theme: Modern dark interface.
- Primary background: Black / near-black.
- Typography: Modern, clean and readable.
- Accent colours: Restrained and elegant.
- Responsive: Mobile, tablet and desktop.

### 19. Landing Page Sections

Investigate and recommend the following structure:

**Section 1 — Hero**

- CVIBE logo.
- Main heading: Your Music. Your Vibe.
- Short description.
- Download CVIBE button.
- View Features button.
- Modern music application mockup.

**Section 2 — About CVIBE**

Explain what the application is and its relationship to YouTube Music.

Do not claim that CVIBE owns or licenses the underlying music catalogue.

**Section 3 — Features**

Showcase actual existing SimpMusic capabilities, including:

- Music discovery.
- Background playback.
- Playlists.
- Lyrics.
- Equalizer.
- Offline caching.
- Music analytics.
- Personalization.
- Desktop support.

Only advertise features verified in the repository.

**Section 4 — Platform Downloads**

Provide separate download cards:

- Android.
- Windows.
- macOS.
- Linux.

Only display download options for platforms that can actually be built and maintained.

Do not invent download URLs.

**Section 5 — Screenshots**

Display genuine screenshots of the rebranded CVIBE application.

Until actual CVIBE screenshots are available, use clearly identified placeholders or screenshots from the original application with appropriate attribution.

**Section 6 — FAQ**

Include questions such as:

- What is CVIBE?
- Is CVIBE free?
- Does CVIBE require YouTube Music Premium?
- Does CVIBE require a Google account?
- Which platforms are supported?
- Can I use CVIBE offline?
- Is CVIBE affiliated with YouTube or Google?

Only provide verified answers.

**Section 7 — Footer**

- CVIBE logo.
- Codeless Technologies attribution.
- Download links.
- Contact information placeholder.
- Privacy information.
- Open-source licence notices.
- Original project attribution.

### 20. Landing Page Technical Recommendation

Recommend an appropriate frontend technology.

Evaluate:

- React + Vite.
- Next.js.
- Static website deployment.
- CDN hosting.
- Download file hosting.

The landing page must remain independent of the original music application.

Do not unnecessarily introduce a new backend.

---

# SECTION F — LICENSING AND THIRD-PARTY DEPENDENCIES

### 21. Open-Source Licensing Audit

This section is critical.

Inspect:

- Root repository licence.
- GPL-3.0 requirements.
- Copyright notices.
- Third-party dependency licences.
- Git submodule licences.
- Branding and trademark restrictions.
- Additional non-commercial statements in the README or documentation.
- Music-service terms and restrictions.

Determine:

1. Whether private personal use of a modified version is permitted.
2. Whether internal installation across personal devices is permitted.
3. Whether removing the SimpMusic branding from the application interface is permissible.
4. Which attribution and copyright notices must remain.
5. Whether source code must be published for private use.
6. What obligations arise if the APK or installers are distributed publicly.
7. Whether a separate licence or maintainer clarification is advisable.

Do not assume that GPL-3.0 automatically resolves every other statement in the repository.

Clearly separate software licensing from YouTube and music-content usage restrictions.

### 22. YouTube Music Dependency

Investigate how the application obtains:

- Music metadata.
- Streaming URLs.
- Playlists.
- User account information.
- Search results.
- Lyrics.
- Audio streams.

Identify all official and unofficial integrations.

Answer these questions:

- Does ordinary playback require YouTube Music Premium?
- Does background playback work without Premium?
- Are there account-based restrictions?
- Does higher audio quality depend on Premium?
- Are any APIs officially supported?
- Can changes to YouTube interfaces break playback?
- Are there rate limits or blocking risks?
- Does the application require a developer API key?
- Are there restrictions on commercial redistribution?

Do not recommend changing the streaming implementation. We only want to understand its existing dependencies and risks.

---

# SECTION G — IMPLEMENTATION ROADMAP

### 23. Step-by-Step White-Label Plan

After the complete audit, produce a phased implementation roadmap.

Suggested phases:

**Phase 0 — Repository audit**
- Complete architecture analysis.
- Feature inventory.
- Licensing analysis.
- Branding inventory.
- Build-system assessment.

**Phase 1 — Branding preparation**
- Establish CVIBE branding assets.
- Identify all replacement locations.
- Determine application IDs.
- Prepare platform-specific configuration.

**Phase 2 — Android white-labeling**
- Rename the application.
- Replace icons.
- Replace branding assets.
- Update application identity.
- Build and test APK.
- Verify all original features.

**Phase 3 — Desktop white-labeling**
- Apply CVIBE branding.
- Update executable and installer names.
- Replace icons.
- Build Windows, macOS and Linux versions where supported.
- Verify desktop functionality.

**Phase 4 — Landing website**
- Build the responsive CVIBE landing page.
- Add genuine application screenshots.
- Add platform download sections.
- Configure hosting.

**Phase 5 — Quality assurance**
- Compare original SimpMusic with CVIBE.
- Test authentication.
- Test music playback.
- Test playlists.
- Test lyrics.
- Test audio effects.
- Test offline functionality.
- Test platform-specific features.
- Verify branding consistency.

### 24. Regression Testing

Create a comprehensive test matrix comparing original SimpMusic against CVIBE.

| Feature | Original status | CVIBE status | Test result |
|---|---|---|---|

No core feature should be considered successfully preserved without testing it.

Provide a regression checklist for Android and desktop separately.

---

# SECTION H — FINAL DELIVERABLE

### 25. Required Final Report

After inspecting the repository, generate a comprehensive report with these sections:

1. Executive summary.
2. Repository overview.
3. Complete technology stack.
4. Architecture diagram.
5. Module-by-module analysis.
6. Complete existing feature inventory.
7. Android application analysis.
8. Desktop application analysis.
9. Authentication and account system.
10. YouTube Music integration.
11. White-label feasibility assessment.
12. Branding modification matrix with file paths.
13. Application identity changes.
14. Licensing and compliance analysis.
15. CVIBE landing website proposal.
16. Build and release requirements.
17. Implementation roadmap.
18. Regression testing plan.
19. Technical risks and limitations.
20. Final recommendation.

### 26. Final Decision

Conclude with a clear assessment:

- Is the entire project technically white-labelable?
- Can Android and desktop both be rebranded?
- Can all existing features remain unchanged?
- What exact files need modification?
- What must not be modified?
- Are there any blockers?
- What are the licensing risks?
- What is the safest implementation sequence?
- What is the estimated development complexity?

Provide a confidence rating for your conclusions.

### FINAL INSTRUCTION

This is a repository investigation and feasibility assessment only.

Do not implement the changes.

Do not modify any source files.

Do not remove or alter any existing functionality.

Do not generate the landing page yet.

First understand the entire repository, verify every important assumption, and deliver a detailed technical report that allows us to make an informed decision before beginning CVIBE development.