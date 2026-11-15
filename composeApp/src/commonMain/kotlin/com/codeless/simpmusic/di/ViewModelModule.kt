package com.codeless.simpmusic.di

import com.codeless.simpmusic.viewModel.AlbumViewModel
import com.codeless.simpmusic.utils.VersionManager
import com.codeless.simpmusic.viewModel.AnalyticsViewModel
import com.codeless.simpmusic.viewModel.ListenTogetherSettingsViewModel
import com.codeless.simpmusic.viewModel.ListenTogetherViewModel
import com.codeless.simpmusic.viewModel.ArtistViewModel
import com.codeless.simpmusic.viewModel.BrowseViewModel
import com.codeless.simpmusic.viewModel.CommentsViewModel
import com.codeless.simpmusic.viewModel.HomeViewModel
import com.codeless.simpmusic.viewModel.ImportViewModel
import com.codeless.simpmusic.viewModel.LibraryDynamicPlaylistViewModel
import com.codeless.simpmusic.viewModel.LibrarySidebarViewModel
import com.codeless.simpmusic.viewModel.LibraryViewModel
import com.codeless.simpmusic.viewModel.LocalPlaylistViewModel
import com.codeless.simpmusic.viewModel.LogInViewModel
import com.codeless.simpmusic.viewModel.LoginSyncHostViewModel
import com.codeless.simpmusic.viewModel.LoginSyncSenderViewModel
import com.codeless.simpmusic.viewModel.MoodViewModel
import com.codeless.simpmusic.viewModel.MoreAlbumsViewModel
import com.codeless.simpmusic.viewModel.NotificationViewModel
import com.codeless.simpmusic.viewModel.NowPlayingBottomSheetViewModel
import com.codeless.simpmusic.viewModel.PlaylistViewModel
import com.codeless.simpmusic.viewModel.PodcastViewModel
import com.codeless.simpmusic.viewModel.SearchViewModel
import com.codeless.simpmusic.viewModel.AutoEqViewModel
import com.codeless.simpmusic.viewModel.SettingsViewModel
import com.codeless.simpmusic.viewModel.SharedViewModel
import com.codeless.simpmusic.viewModel.SongSelectionViewModel
import com.codeless.simpmusic.viewModel.TasteViewModel
import com.codeless.simpmusic.viewModel.WrappedViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule =
    module {
        single {
            SharedViewModel(
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
            )
        }
        single {
            SearchViewModel(
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            SongSelectionViewModel(
                get(),
                get(),
            )
        }
        // Only one of these resolves on a given platform: Desktop binds the host repository, Android the
        // sender. Koin resolves dependencies when a ViewModel is created, not when it is declared.
        viewModel { LoginSyncHostViewModel(get()) }
        viewModel { LoginSyncSenderViewModel(get()) }
        viewModel { CommentsViewModel(get(), get()) }
        viewModel {
            NowPlayingBottomSheetViewModel(
                get(),
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            LibraryViewModel(
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            LibraryDynamicPlaylistViewModel(
                get(),
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            ImportViewModel(
                get(),
            )
        }
        viewModel {
            AlbumViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            HomeViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            AutoEqViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            SettingsViewModel(
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            ArtistViewModel(
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            PlaylistViewModel(
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            LogInViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            PodcastViewModel(
                get(),
            )
        }
        viewModel {
            MoreAlbumsViewModel(
                get(),
            )
        }
        viewModel {
            BrowseViewModel(
                get(),
            )
        }
        viewModel {
            LibrarySidebarViewModel(
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            LocalPlaylistViewModel(
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            NotificationViewModel(
                get(),
            )
        }
        viewModel {
            MoodViewModel(
                get(),
                get(),
            )
        }
        viewModel {
            AnalyticsViewModel(
                get(),
                get(),
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            WrappedViewModel(
                get(),
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            TasteViewModel(
                get(),
                get(),
                get(),
                get(),
                get(),
                get(),
            )
        }
        viewModel {
            ListenTogetherSettingsViewModel(get())
        }
        viewModel {
            ListenTogetherViewModel(
                repository = get(),
                dataStore = get(),
                bridge = get(),
            )
        }

    }