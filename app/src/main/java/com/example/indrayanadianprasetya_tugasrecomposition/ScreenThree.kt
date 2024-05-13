package com.example.indrayanadianprasetya_tugasrecomposition

import android.annotation.SuppressLint
import androidx.browser.customtabs.CustomTabsIntent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.sourceInformationMarkerEnd
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import com.example.indrayanadianprasetya_tugasrecomposition.ui.theme.poppinsFontFamily

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ScreenThree(navController: NavController, kode: String) {
    val kode = kode.toInt()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Back Arrow",
                            tint = Color(0xFF9F8772),
                            modifier = Modifier
                                .size(26.dp)
                                .clickable(
                                    onClick = { navController.popBackStack() })
                        )
                        TopBar(teks = listOfFoods[kode].title)
                    }

                },
                modifier = Modifier.shadow(elevation = 4.dp)
            )
        }
    ) {
        Column(
            modifier = Modifier
                .padding(top = 60.dp)
        ) {
            Box(contentAlignment = Alignment.BottomStart) {
                val context = LocalContext.current
                Image(
                    painter = painterResource(id = listOfFoods[kode].imgRoute),
                    contentDescription = listOfFoods[kode].title,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
                        .clip(RoundedCornerShape(bottomEnd = 30.dp, bottomStart = 30.dp))
                )
                Button(
                    onClick = {
                        val customTabsIntent = CustomTabsIntent
                            .Builder()
                            .build()
                        customTabsIntent.launchUrl(context, listOfFoods[kode].link.toUri())
                    },
                    colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF9F8772),
                    ),
                    modifier = Modifier.padding(start = 20.dp, bottom = 10.dp)
                ) {
                    Icon(imageVector = Icons.Filled.PlayArrow, contentDescription = "play")
                    Text(text = "Cara Memasak")
                }
            }
            Column(
                modifier = Modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp, bottom = 80.dp)
            ) {
                val scroll = rememberScrollState(0)
                Text(
                    text = listOfFoods[kode].description,
                    textAlign = TextAlign.Justify,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    modifier = Modifier.verticalScroll(scroll)
                )
            }
        }
    }

}
