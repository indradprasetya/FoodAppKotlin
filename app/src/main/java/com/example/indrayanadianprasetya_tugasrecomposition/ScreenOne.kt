package com.example.indrayanadianprasetya_tugasrecomposition

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.indrayanadianprasetya_tugasrecomposition.navigation.Screens
import com.example.indrayanadianprasetya_tugasrecomposition.navigation.listOfNavItems
import com.example.indrayanadianprasetya_tugasrecomposition.ui.theme.poppinsFontFamily

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenOne(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    TopBar(teks = "Beranda")
                }, modifier = Modifier.shadow(elevation = 4.dp)
            )
        },
    ) {
        Column(
            modifier = Modifier.padding(top = 80.dp, start = 20.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(3.dp),
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.fire),
                    contentDescription = "fire",
                    Modifier.size(22.dp)
                )
                Text(
                    text = "Spesial Untukmu",
                    fontSize = 18.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                )
            }
            Spacer(modifier = Modifier.height(3.dp))
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(listOfFoods.size) { index ->
                    val id = index.toString()
                    Image(
                        painter = painterResource(id = listOfFoods[index].imgRoute),
                        contentDescription = listOfFoods[index].title,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(200.dp)
                            .clip(RoundedCornerShape(30.dp))
                            .clickable(onClick = {
                                navController.navigate(Screens.ScreenThree.name + "/$id")
                            })
                    )
                    if (index == listOfFoods.size - 1) {
                        Spacer(modifier = Modifier.width(20.dp))
                    }

                }

            }
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(3.dp),
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.food),
                    contentDescription = "plate",
                    Modifier.size(22.dp)
                )
                Text(
                    text = "Cita Rasa Nusantara",
                    fontSize = 18.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                )
            }
            Spacer(modifier = Modifier.height(3.dp))
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.padding(bottom = 90.dp, end = 10.dp)
            ) {
                items(listOfFoods.size) { index ->
                    val id = index.toString()
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 10.dp)
                            .clickable(onClick = {
                            navController.navigate(Screens.ScreenThree.name + "/$id")
                        })
                    ) {
                        Image(
                            painter = painterResource(id = listOfFoods[index].imgRoute),
                            contentDescription = listOfFoods[index].title,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(65.dp)
                                .clip(RoundedCornerShape(100.dp))
                        )
                        Column(
                            modifier = Modifier.padding(start = 10.dp)
                        ) {
                            Text(
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight.SemiBold,
                                text = listOfFoods[index].title,
                                fontSize = 15.sp,
                                color = Color(0xFF9F8772)
                            )
                            Text(
                                text = listOfFoods[index].shortDesc,
                                fontSize = 12.sp,
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight.Normal
                            )
                        }

                    }
                    Divider(color = Color(0xFFC7C8CC), thickness = 1.dp)
                }
            }
        }
    }
}



