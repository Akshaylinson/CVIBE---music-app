package com.codeless.simpmusic.ui.navigation.graph

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.codeless.simpmusic.ui.navigation.destination.login.DiscordLoginDestination
import com.codeless.simpmusic.ui.navigation.destination.login.LastfmLoginDestination
import com.codeless.simpmusic.ui.navigation.destination.login.LoginDestination
import com.codeless.simpmusic.ui.navigation.destination.login.SpotifyLoginDestination
import com.codeless.simpmusic.ui.screen.login.DiscordLoginScreen
import com.codeless.simpmusic.ui.screen.login.DiscordOAuthLoginScreen
import com.codeless.simpmusic.ui.screen.login.LastfmLoginScreen
import com.codeless.simpmusic.ui.screen.login.LoginScreen
import com.codeless.simpmusic.ui.screen.login.SpotifyLoginScreen
import org.simpmusic.discord.isDiscordOAuthAvailable

fun NavGraphBuilder.loginScreenGraph(
    innerPadding: PaddingValues,
    navController: NavController,
    hideBottomBar: () -> Unit,
    showBottomBar: () -> Unit,
) {
    composable<LoginDestination> {
        LoginScreen(
            innerPadding = innerPadding,
            navController = navController,
            hideBottomNavigation = hideBottomBar,
            showBottomNavigation = showBottomBar,
        )
    }

    composable<SpotifyLoginDestination> {
        SpotifyLoginScreen(
            innerPadding = innerPadding,
            navController = navController,
            hideBottomNavigation = hideBottomBar,
            showBottomNavigation = showBottomBar,
        )
    }

    composable<DiscordLoginDestination> {
        // A Full build carries a Discord application and logs in through Discord's own page; a FOSS
        // build keeps the WebView login whose token kizzy uses.
        if (isDiscordOAuthAvailable()) {
            DiscordOAuthLoginScreen(
                innerPadding = innerPadding,
                navController = navController,
                hideBottomNavigation = hideBottomBar,
                showBottomNavigation = showBottomBar,
            )
        } else {
            DiscordLoginScreen(
                innerPadding = innerPadding,
                navController = navController,
                hideBottomNavigation = hideBottomBar,
                showBottomNavigation = showBottomBar,
            )
        }
    }

    composable<LastfmLoginDestination> {
        LastfmLoginScreen(
            innerPadding = innerPadding,
            navController = navController,
            hideBottomNavigation = hideBottomBar,
            showBottomNavigation = showBottomBar,
        )
    }
}