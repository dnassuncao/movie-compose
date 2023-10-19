package br.com.dnassuncao.movieapp.core.presentation.navigation

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.dnassuncao.movieapp.features.movie_popular.presentation.MoviePopularScreen
import br.com.dnassuncao.movieapp.features.movie_popular.presentation.MoviePopularViewModel

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.MoviePopular.route
    ) {
        composable(BottomNavItem.MoviePopular.route) {

            val viewModel: MoviePopularViewModel = hiltViewModel()
            val uiState = viewModel.uiState.collectAsState().value

            MoviePopularScreen(
                uiState = uiState,
                navigateToDetailMovie = { }
            )
        }
        composable(BottomNavItem.MovieSearch.route) {
            Text(text = "MovieSearch")
        }
        composable(BottomNavItem.MovieFavorite.route) {
            Text(text = "MovieFavorite")
        }
    }
}