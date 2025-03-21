package com.example.antidote.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CButton(
    onclick: () -> Unit = {},
    text: String,
){
    Button(onClick = onclick,
        shape = MaterialTheme.shapes.large,
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color(0xF7C9A92),

//                ),
        modifier= Modifier
            .fillMaxWidth()
            .height(52.dp),
    ) {
        Text(text = text,
            style= TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight(700),
                color = Color.White
            )
        )

    }
}