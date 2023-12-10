package com.nazareto.sharificlinic

import android.content.Intent
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip

@Preview
@Composable
private fun Preview() {
    CardView()
}

@Composable
fun CardView() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .width(400.dp)
            .height(400.dp),
        shape = RoundedCornerShape(20.dp)
    ) {
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            Column(modifier = Modifier.padding(16.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.random_pic),
                    contentDescription = "Card Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                )

                Text(
                    text = "طزریق بوتاکس",
                    modifier = Modifier.padding(top = 16.dp),
                    fontSize = 20.sp
                )

                Text(
                    text = "طزریق بوتاکس طزریق بوتاکس طزریق بوتاکس طزریق بوتاکس طزریق بوتاکس طزریق بوتاکس",
                    modifier = Modifier.padding(top = 8.dp)
                )

                Row(modifier = Modifier.padding(top = 16.dp)) {
                    val openUrlLauncher = rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                        // Handle the result if needed
                    }

                    Button(
                        onClick = {
                            // Open the URL in a web browser
                            openUrlLauncher.launch(Intent(Intent.ACTION_VIEW, Uri.parse("https://sharificlinic.com/sharifAdmin/landing/list/")))
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(text = "رزرو نوبت")
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    Button(
                        onClick = { /* Handle second button click */ },
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(text = "مشاوره رایگان")
                    }
                }
            }
        }
    }
}