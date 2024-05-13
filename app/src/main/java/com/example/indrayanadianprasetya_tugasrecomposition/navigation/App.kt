package com.example.indrayanadianprasetya_tugasrecomposition.navigation

import ScreenTwo
import android.annotation.SuppressLint
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalAbsoluteTonalElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.indrayanadianprasetya_tugasrecomposition.ScreenFour
import com.example.indrayanadianprasetya_tugasrecomposition.ScreenOne
import com.example.indrayanadianprasetya_tugasrecomposition.ScreenThree
import com.example.indrayanadianprasetya_tugasrecomposition.navigation.Screens
import com.example.indrayanadianprasetya_tugasrecomposition.ui.theme.poppinsFontFamily


@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun App() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listOfNavItems.map { navItem ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any { it.route == navItem.route } == true,
                        onClick = {
                            navController.navigate(navItem.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            Icon(
                                imageVector = navItem.icon,
                                contentDescription = navItem.title,
                            )
                        },
                        label = {
                            Text(
                                text = navItem.title,
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight.Normal
                            )
                        },
                        colors = androidx.compose.material3.NavigationBarItemDefaults
                            .colors(
                                selectedIconColor = Color(0xFF9F8772),
                                unselectedIconColor = Color(0xFFC7C8CC),
                                indicatorColor = Color(0xFFedeae6),
                            )
                    )
                }

            }
        })
    {
        NavHost(
            navController = navController,
            startDestination = Screens.ScreenOne.name
        ) {
            composable(route = Screens.ScreenOne.name) {
                ScreenOne(navController)
            }
            composable(route = Screens.ScreenTwo.name) {
                ScreenTwo(navController)
            }
            composable(route = Screens.ScreenThree.name + "/{name}") {
                val name = it.arguments?.getString("name")
                ScreenThree(navController, name ?: "No Name")
            }
            composable(route = Screens.ScreenFour.name) {
                ScreenFour()
            }

        }
    }
}
