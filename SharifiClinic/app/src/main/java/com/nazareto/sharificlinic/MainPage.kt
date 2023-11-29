package com.nazareto.sharificlinic

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
private fun Preview() {
    MainPage()
}

@Composable
fun MainPage() {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Box(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "کلینیک شریفی",
                    fontSize = 40.sp,
                    modifier = Modifier.padding(top = 50.dp, start = 20.dp)
                )

                Text(
                    text = "کلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفی",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 50.dp, start = 20.dp)
                )

                Text(
                    text = "نمونه کار ها",
                    fontSize = 40.sp,
                    modifier = Modifier.padding(top = 530.dp, start = 20.dp)
                )

                Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                    CardView()
                    CardView()
                    CardView()
                    CardView()
                }

                Text(
                    text = "ما همیشه با شماییم",
                    fontSize = 40.sp,
                    modifier = Modifier.padding(top = 550.dp, start = 20.dp)
                )

                Text(
                    text = "کلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفی",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 50.dp, start = 20.dp)
                )
            }
        }
    }
}