package com.example.cointracker.screen.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cointracker.R

@Composable
fun Header() {

    Box(
        modifier = Modifier
            .height(120.dp)
            .fillMaxWidth()
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xFF3A3A3A),
                        Color(0xFF1E1E1E)
                    )
                )
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.ftftp),
            contentDescription = "Logo",
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.Center)
        )

        Text(
            text = "Coin Tracker",
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 16.dp, bottom = 8.dp)
        )
    }

    Box(
        modifier = Modifier
            .height(3.dp)
            .fillMaxWidth()
            .background(Color.Yellow)
    )
}

