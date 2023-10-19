package br.com.dnassuncao.movieapp.presentation.navigation

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.MoviePopular.route
    ) {
        composable(BottomNavItem.MoviePopular.route) {
            Text(text = "MoviePopular")
        }
        composable(BottomNavItem.MovieSearch.route) {
            Text(text = "MovieSearch")
        }
        composable(BottomNavItem.MovieFavorite.route) {
            Text(text = "MovieFavorite")
        }
    }
}