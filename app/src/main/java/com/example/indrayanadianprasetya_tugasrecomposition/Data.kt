package com.example.indrayanadianprasetya_tugasrecomposition

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.indrayanadianprasetya_tugasrecomposition.navigation.Screens
import com.example.indrayanadianprasetya_tugasrecomposition.ui.theme.poppinsFontFamily

@Composable
fun TopBar(teks: String) {
    val teks = teks
    Text(
        text = teks,
        fontFamily = poppinsFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        color = Color(0xFF9F8772)
    )
}

data class Foods(
    val id: Int,
    val title: String,
    val imgRoute: Int,
    val shortDesc: String,
    val description: String
)

val listOfFoods = listOf(
    Foods(
        id = 1,
        title = "Soto Ayam",
        imgRoute = R.drawable.soto,
        shortDesc = "Makanan khas Indonesia yang berupa sejenis sup ayam dengan kuah yang berwarna kekuningan",
        description = "Soto ayam adalah makanan khas Indonesia yang berupa sejenis sup ayam dengan kuah yang berwarna kekuningan. Warna kuning ini dikarenakan oleh kunyit yang digunakan sebagai bumbu. Soto ayam banyak ditemukan di daerah-daerah di Indonesia dan Singapura. Selain ayam bahan yang digunakan juga meliputi telur rebus, irisan kentang, daun seledri, serta bawang goreng. Terkadang soto juga disajikan dengan lontong atau nasi putih. Selain itu soto ayam juga sering dihidangkan dengan sambal, kerupuk dan koya (campuran tumbukan kerupuk dengan bawang putih)."
    ),
    Foods(
        id = 2,
        title = "Nasi Goreng",
        imgRoute = R.drawable.nasi,
        shortDesc = "Sajian nasi yang digoreng dalam sebuah wajan atau penggorengan",
        description = "Nasi goreng merupakan sajian nasi yang digoreng dalam sebuah wajan atau penggorengan yang menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu seperti garam, bawang putih, bawang merah, merica, rempah-rempah tertentu dan kecap manis. Selain itu, ditambahkan bahan-bahan pelengkap seperti telur, sayur-sayuran, makanan laut, atau daging. Makanan tersebut sering kali disantap sendiri atau disertai dengan hidangan lainnya. Nasi goreng adalah komponen populer dari masakan Asia Timur, Tenggara dan Selatan pada wilayah tertentu. Sebagai hidangan buatan rumah, nasi goreng biasanya dibuat dengan bahan-bahan yang tersisa dari hidangan lainnya, yang berujung pada ragam yang tak terbatas."
    ),
    Foods(
        id = 3,
        title = "Mi Ayam",
        imgRoute = R.drawable.mie,
        shortDesc = "Hidangan khas Indonesia yang terbuat dari mi gandum.",
        description = "Mi ayam adalah hidangan khas Indonesia yang terbuat dari mi gandum yang dibumbui dengan daging ayam yang biasanya dipotong dadu. Hidangan ini banyak terpengaruh dengan teknik penyajian kuliner yang digunakan dalam hidangan Tionghoa. Di Indonesia, mi ayam merupakan hidangan Tionghoa-Indonesia yang sangat terkenal. Mi ayam sering dijual sebagai hidangan jalanan oleh pedagang kaki lima dengan gerobak keliling sederhana, yang biasanya berkeliling di jalan-jalan sekitar perumahan warga. Mi ayam juga merupakan hidangan populer yang disajikan di warung makan kecil pinggir jalan, hingga rumah makan besar."
    ),
    Foods(
        id = 4,
        title = "Bakso",
        imgRoute = R.drawable.bakso,
        shortDesc = "Jenis bola daging yang lazim ditemukan pada masakan Indonesia",
        description = "Bakso (Hokkien: 肉酥; dialek Xiamen: bah so) adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia. Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, tetapi ada juga bakso yang terbuat dari daging ayam, babi, ikan, udang, kambing, bahkan daging kerbau. Dalam penyajiannya, bakso umumnya disajikan panas-panas dengan kuah kaldu sapi bening, dicampur mi, bihun, taoge, tahu, terkadang telur lalu ditaburi bawang goreng dan seledri."
    ),
    Foods(
        id = 5,
        title = "Rendang",
        imgRoute = R.drawable.rendang,
        shortDesc = "Hidangan berbahan dasar daging yang dihasilkan dari proses memasak suhu rendah dalam waktu lama",
        description = "Rendang (bahasa Minangkabau: randang; Jawi: رندڠ) adalah hidangan berbahan dasar daging yang dihasilkan dari proses memasak suhu rendah dalam waktu lama dengan menggunakan aneka rempah-rempah dan santan. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat dan dedak. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna cokelat terang keemasan. Pada 2011, rendang pernah dinobatkan sebagai hidangan yang menduduki peringkat pertama daftar World's 50 Most Delicious Foods (50 Hidangan Terlezat Dunia) versi CNN International."
    ),
    Foods(
        id = 6,
        title = "Sate Ayam",
        imgRoute = R.drawable.sateayam,
        shortDesc = "Potongan daging ayam yang ditusuk dengan bambu",
        description = "Sate ayam adalah makanan khas Indonesia. Sate Ayam dibuat dari daging ayam. Pada umumnya sate ayam dimasak dengan cara dipanggang dengan menggunakan arang dan disajikan dengan pilihan bumbu kacang atau bumbu kecap. Sate ini biasanya disajikan bersama dengan lontong atau nasi."
    ),
    Foods(
        id = 7,
        title = "Gado-Gado",
        imgRoute = R.drawable.gadogado,
        shortDesc = "Terdiri dari sayur-sayuran, kentang, tempe, tahu, telur rebus, dan lain-lain diberi bumbu sambal kacang dan sebagainya",
        description = "Adanya gado-gado bermula pada abad ke-17 (1628-1629), saat Kesultanan Mataram yang dipimpin Sultan Agung melakukan Penyerbuan di Batavia, kehabisan pasokan bahan makanan terutama beras. Selain itu, lumbung-lumbung beras di sekitar Batavia dibakar oleh VOC, sehingga membuat prajurit warok dari Ponorogo yang tergabung dalam pasukan perang membuat sambal bumbu pecel dari kacang tanah, kemudian disiramkan ke berbagai sayuran mentah yang ada di sekitar persawahan untuk bertahan hidup. Tindakan ini dalam Bahasa Jawa disebut Gadho yang berarti makan hanya lauk saja atau makan lauk tanpa nasi. Resep gado-gado kemudian diikuti oleh prajurit lainnya untuk memakan sayur seadanya yang disiram cairan bumbu pecel. Seiring perkembangan zaman, kini gado-gado ditambahkan lontong yang diiris kecil, telur, tahu dan kerupuk yang disajikan di warung kecil hingga restoran."
    ),
    Foods(
        id = 8,
        title = "Gulai",
        imgRoute = R.drawable.gulai,
        shortDesc = "Makanan ini dianggap sebagai bentuk lain dari kari, dan secara internasional sering disebut sebagai kari ala Indonesia",
        description = "Gulai alias Gule adalah Masakan Indonesia berbahan baku daging ayam, aneka ikan, kambing, sapi, jeroan, atau sayuran seperti nangka muda dan daun singkong, yang diolah dalam kuah bumbu rempah yang bercita rasa gurih yang berasal dari Sumatra, Indonesia. Ciri khas gulai adalah bumbunya yang kaya rempah antara lain kunyit, ketumbar, lada, lengkuas, jahe, cabai merah, bawang merah, bawang putih, adas, pala, serai, kayu manis, dan jintan yang dihaluskan, dicampur, kemudian dimasak dalam santan. Masakan ini yang memiliki ciri khas berwarna kuning karena pengaruh sari kunyit. "
    ),
    Foods(
        id = 9,
        title = "Gudeg",
        imgRoute = R.drawable.gudeg,
        shortDesc = "Hidangan khas Daerah Istimewa Yogyakarta yang terbuat dari nangka muda yang dimasak dengan santan.",
        description = "Gudeg dibuat dari buah nangka yang tumbuh di banyak pulau di Indonesia, khususnya di Jawa, dan merupakan tanaman pangan yang cukup penting. Sejumlah besar rempah-rempah dan bumbu tertentu digunakan dalam proses perebusan, rempah ini juga meningkatkan masa simpan gudegDi Jawa Tengah, ada legenda yang mengaitkan asal-usul gudeg dengan berdirinya Kesultanan Mataram pada akhir abad ke-16. Dikisahkan bahwa pada saat itu pejuang yang membuka hutan untuk pembangunan ibu kota negara baru di wilayah Yogyakarta saat ini tidak mendapat pasokan makanan yang memadai. Sementara itu hanya pohon nangka dan kelapa yang tumbuh subur di hutan tersebut. Saat masih muda buah nangka keras, dan tidak dapat dimakan mentah, mereka pun merebus buah nangka muda dalam santan dalam panci logam besar dan mengaduknya dengan papan kayu. Proses memasak seperti ini dalam bahasa jawa sehari-hari disebut hangudêk (jw. Hangudek)—mengaduk. Dari kata inilah menurut legenda, menjadi asal mula nama makanan yang ditemukan oleh prajurit Mataram tersebut, Gudeg."
    ),
    Foods(
        id = 10,
        title = "Rawon",
        imgRoute = R.drawable.rawon,
        shortDesc = "Sup daging berkuah hitam",
        description = "Rawon (Aksara Jawa:ꦫꦮꦺꦴꦤ꧀) adalah masakan khas Indonesia yang berasal dari Ponorogo, Jawa Timur, yang berupa sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwek. Makanan ini telah berusia lebih dari 1.000 tahun. Rawon dari Ponorogo menyebar ke penjuru Jawa Timur dan dikenal sebagai masakan khas Jawa Timur."
    )
)