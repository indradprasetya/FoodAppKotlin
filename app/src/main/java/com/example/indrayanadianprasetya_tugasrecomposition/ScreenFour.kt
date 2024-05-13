package com.example.indrayanadianprasetya_tugasrecomposition

import android.annotation.SuppressLint
import androidx.browser.customtabs.CustomTabsIntent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
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
import com.example.indrayanadianprasetya_tugasrecomposition.ui.theme.poppinsFontFamily

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenFour() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    TopBar(teks = "Tentang Saya")
                },
                modifier = Modifier.shadow(elevation = 4.dp)
            )
        }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 70.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.indra),
                contentDescription = "foto indra",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(165.dp)
                    .clip(RoundedCornerShape(100.dp))
            )
            Spacer(modifier = Modifier.size(10.dp))
            Text(
                text = "indrayanadian7@gmail.com",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Normal
            )
            Text(
                text = "Indrayana Dian Prasetya",
                color = Color(0xFF9F8772),
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
            )
            Text(
                text = "Mahasiswa D4 Teknik Informatika Politeknik Negeri Malang",
                fontSize = 18.sp,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
            )
            Spacer(modifier = Modifier.size(10.dp))
            Text(
                text = "Find Me On",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.SemiBold
            )
            val context = LocalContext.current
            val url1 = "https://www.linkedin.com/in/indradprasetya/"
            val url2 = "https://www.instagram.com/indradprasetya/"

            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.linkedin),
                    contentDescription = "linkedin",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {
                            val customTabsIntent = CustomTabsIntent
                                .Builder()
                                .build()
                            customTabsIntent.launchUrl(context, url1.toUri())
                        })
                Image(painter = painterResource(id = R.drawable.ig),
                    contentDescription = "instagram",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {
                            val customTabsIntent = CustomTabsIntent
                                .Builder()
                                .build()
                            customTabsIntent.launchUrl(context, url2.toUri())
                        })

            }

        }

    }
}
