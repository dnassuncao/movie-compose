package br.com.dnassuncao.movieapp.core.presentation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import br.com.dnassuncao.movieapp.core.presentation.navigation.BottomNavigationBar
import br.com.dnassuncao.movieapp.core.presentation.navigation.NavigationGraph

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) {
        NavigationGraph(navController = navController)
    }
}