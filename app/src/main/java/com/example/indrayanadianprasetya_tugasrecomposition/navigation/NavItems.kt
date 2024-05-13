package com.example.indrayanadianprasetya_tugasrecomposition.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItems(
    val title: String,
    val route: String,
    val icon: ImageVector
)

val listOfNavItems = listOf(
    NavItems(
        title = "Beranda",
        route = Screens.ScreenOne.name,
        icon = Icons.Filled.Home
    ),
    NavItems(
        title = "Katalog Menu",
        route = Screens.ScreenTwo.name,
        icon = Icons.Filled.List
    ),
    NavItems(
        title = "Tentang Saya",
        route = Screens.ScreenFour.name,
        icon = Icons.Filled.AccountCircle
    )
)