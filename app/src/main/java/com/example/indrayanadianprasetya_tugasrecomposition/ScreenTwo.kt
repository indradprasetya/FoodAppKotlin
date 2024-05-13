import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.indrayanadianprasetya_tugasrecomposition.TopBar
import com.example.indrayanadianprasetya_tugasrecomposition.listOfFoods
import com.example.indrayanadianprasetya_tugasrecomposition.navigation.Screens
import com.example.indrayanadianprasetya_tugasrecomposition.ui.theme.poppinsFontFamily


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenTwo(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    TopBar(teks = "Katalog Menu")
                },
                modifier = Modifier.shadow(elevation = 4.dp)
            )
        }
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 70.dp, bottom = 80.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(16.dp)
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
            }
        }

    }

}

