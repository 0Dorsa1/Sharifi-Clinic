package com.nazareto.sharificlinic

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
private fun Preview() {
    MainPage()
}

private val LightColorPalette = lightColors(
    primary = Color(0xFF1976D2), // Blue
    primaryVariant = Color(0xFF0D47A1), // Dark Blue
    secondary = Color(0xFFEF6C00), // Orange
    secondaryVariant = Color(0xFFE65100), // Dark Orange
    background = Color(0xFFF5F5F5), // Light Gray
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.Black,
    onSurface = Color.Black
)

private val DarkColorPalette = darkColors(
    primary = Color(0xFF1976D2), // Blue
    primaryVariant = Color(0xFF0D47A1), // Dark Blue
    secondary = Color(0xFFEF6C00), // Orange
    secondaryVariant = Color(0xFFE65100), // Dark Orange
    background = Color.Black,
    surface = Color.Black,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White
)

@Composable
fun MainPage() {
    val selectedMenuItem = remember { mutableStateOf("") }
    val dropdownItems = listOf("Item 1", "Item 2", "Item 3")
    MaterialTheme(colors = LightColorPalette) {
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            BackgroundImage(imageResId = R.drawable.background_img) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                ) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "کلینیک شریفی",
                            fontSize = 40.sp,
                            modifier = Modifier.padding(top = 50.dp, start = 20.dp),
                            color = Color.White
                        )

                        Text(
                            text = "کلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفی",
                            fontSize = 20.sp,
                            modifier = Modifier.padding(top = 50.dp, start = 20.dp),
                            color = Color.White

                        )

                        Text(
                            text = "نمونه کار ها",
                            fontSize = 40.sp,
                            modifier = Modifier.padding(top = 530.dp, start = 20.dp),
                            color = Color.White

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
                            modifier = Modifier.padding(top = 570.dp, start = 20.dp),
                            color = Color.White

                        )

                        Text(
                            text = "کلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفیکلینیک شریفی",
                            fontSize = 20.sp,
                            modifier = Modifier.padding(top = 50.dp, start = 20.dp),
                            color = Color.White

                        )

                        Text(
                            text = "مشاوره رایگان",
                            fontSize = 40.sp,
                            modifier = Modifier.padding(top = 700.dp, start = 20.dp),
                            color = Color.White

                        )

                        Box(
                            modifier = Modifier
                                .clickable(onClick = {
                                    if (selectedMenuItem.value.isNotEmpty()) {
                                        selectedMenuItem.value = ""
                                    } else {
                                        selectedMenuItem.value = dropdownItems.firstOrNull() ?: ""
                                    }
                                })
                                .padding(vertical = 50.dp, horizontal = 40.dp)
                                .background(
                                    color = Color.LightGray,
                                    shape = RoundedCornerShape(15.dp)
                                )
                                .fillMaxWidth()
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.End,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "انتخاب موضوع",
                                    fontSize = 20.sp,
                                    modifier = Modifier.padding(start = 15.dp),
                                    color = Color.White

                                )
                                Spacer(modifier = Modifier.weight(1f))
                                Icon(
                                    painter = painterResource(id = R.drawable.down_arrow),
                                    contentDescription = "Icon 1",
                                    modifier = Modifier
                                        .size(30.dp)
                                        .padding(horizontal = 8.dp) // Add padding between elements
                                )
                            }
                        }

                        Box(
                            modifier = Modifier
                                .clickable(onClick = {
                                    if (selectedMenuItem.value.isNotEmpty()) {
                                        selectedMenuItem.value = ""
                                    } else {
                                        selectedMenuItem.value = dropdownItems.firstOrNull() ?: ""
                                    }
                                })
                                .padding(vertical = 30.dp, horizontal = 40.dp)
                                .background(
                                    color = Color.LightGray,
                                    shape = RoundedCornerShape(15.dp)
                                )
                                .fillMaxWidth()
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.End,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "شماره تلفن",
                                    fontSize = 20.sp,
                                    modifier = Modifier.padding(start = 15.dp),
                                    color = Color.White

                                )
                                Spacer(modifier = Modifier.weight(1f))
                                Icon(
                                    painter = painterResource(id = R.drawable.call_icon),
                                    contentDescription = "Icon 1",
                                    modifier = Modifier
                                        .size(30.dp)
                                        .padding(horizontal = 8.dp) // Add padding between elements
                                )
                            }
                        }

                        Box(
                            modifier = Modifier
                                .clickable(onClick = {
                                    if (selectedMenuItem.value.isNotEmpty()) {
                                        selectedMenuItem.value = ""
                                    } else {
                                        selectedMenuItem.value = dropdownItems.firstOrNull() ?: ""
                                    }
                                })
                                .padding(vertical = 30.dp, horizontal = 40.dp)
                                .background(
                                    color = Color.LightGray,
                                    shape = RoundedCornerShape(15.dp)
                                )
                                .fillMaxWidth()
                                .height(200.dp)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.End,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "متن درخواست مشاوره",
                                    fontSize = 20.sp,
                                    modifier = Modifier.padding(start = 15.dp),
                                    color = Color.White

                                )
                                Spacer(modifier = Modifier.weight(1f))
                                Icon(
                                    painter = painterResource(id = R.drawable.note_icon),
                                    contentDescription = "Icon 1",
                                    modifier = Modifier
                                        .size(40.dp)
                                        .padding(horizontal = 8.dp) // Add padding between elements
                                )
                            }
                        }

                        Spacer(modifier = Modifier.padding(top=500.dp))

                        Paper()
                        Paper()
                        Paper()


                        Text(
                            text = "تماس با ما",
                            fontSize = 40.sp,
                            modifier = Modifier.padding(top = 620.dp, start = 20.dp),
                            color = Color.White

                        )

                        Row(modifier = Modifier.padding(top = 20.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.call_icon),
                                contentDescription = "Icon 1",
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding(horizontal = 8.dp) // Add padding between elements
                            )

                            Text(
                                text = "65843200",
                                fontSize = 20.sp,
                                color = Color.White

                            )
                        }

                        Text(
                            text = "مفتخریم که در زمینه زیبایی همراه شما باشیم. مفتخریم که در زمینه زیبایی همراه شما باشیم.مفتخریم که در زمینه زیبایی همراه شما باشیم.مفتخریم که در زمینه زیبایی همراه شما باشیم.",
                            fontSize = 20.sp,
                            modifier = Modifier.padding(top = 20.dp, start = 20.dp),
                            color = Color.White

                        )

                        Button(modifier = Modifier.padding(start=20.dp,top =40.dp), onClick = { /*TODO*/ }) {
                            Text(text = "مشاوره رایگان")
                        }

                        Spacer(modifier = Modifier.padding(100.dp))

                        DropdownMenu(
                            expanded = selectedMenuItem.value.isNotEmpty(),
                            onDismissRequest = { selectedMenuItem.value = "" },
                            modifier = Modifier.padding(top = 60.dp, start = 20.dp)
                        ) {
                            dropdownItems.forEach { item ->
                                DropdownMenuItem(
                                    onClick = {
                                        selectedMenuItem.value = item
                                    }
                                ) {
                                    Text(text = item)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun BackgroundImage(imageResId: Int, content: @Composable () -> Unit) {
    val painter: Painter = painterResource(id = imageResId)
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            alignment = Alignment.Center
        )
        content()
    }
}