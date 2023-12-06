package com.nazareto.sharificlinic

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
private fun Preview() {
    Paper()
}

@Composable
fun Paper() {

    Column(modifier = Modifier.padding(top = 20.dp)) {
        Image(
            painter = painterResource(id = R.drawable.random_pic),
            contentDescription = "Card Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
        )

        Text(
            modifier = Modifier.padding(top = 20.dp),
            color = Color.White,
            text = " شریفی کلینیک شریفی کلینیک شریفی کلینیک شریفی کلینیک شریفی کلینیک شریفی کلینیک شریفی کلینیک شریفی کلینیک شریفی کلینیک شریفی کلینیک"
        )

        Button(modifier = Modifier.padding(top = 20.dp), onClick = { /*TODO*/ }) {
            Text(text = "مشاهده مقاله")
        }
    }


}