package com.example.antidote.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.antidote.ui.theme.Purple1
import com.example.antidote.ui.theme.Purple5

@Composable
fun DontHaveAccountRow(
    text1: String,
    text2: String,
){
    Row(modifier= Modifier.padding(top=12.dp, bottom = 100.dp)){
        Text(text = text1,
            style= TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(400),
                color = Purple1
            )
        )
        Text(text = text2,
            style= TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(800),
                color = Purple5
            )
        )

    }
}