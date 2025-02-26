package com.example.antidote


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.antidote.components.CButton
import com.example.antidote.components.DontHaveAccountRow
import com.example.antidote.ui.theme.Purple1
import com.example.antidote.ui.theme.Purple4




@Composable
fun WelcomeScreen(
    modifier: Modifier =Modifier
) {
    Box(
//       contentAlignment = Alignment.Center ,
        modifier= modifier
            .fillMaxSize()
            .background(color = Color.Black)

    ){
//        content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)

        ){
            Spacer(modifier= Modifier.weight(1f))

            Text(text = "A N T I D O T E" ,
                fontSize = 32.sp,
                fontWeight = FontWeight(700),
                color = Purple1
                )
            Text(text = "You got this" ,
                fontSize = 18.sp,
                fontWeight = FontWeight(700),
                color = Purple4
            )
            Spacer(modifier= Modifier.weight(1f))
//          button
            CButton(
                text = "Sign In with Email"
            )
         DontHaveAccountRow(text1 = "Don't have an account?", text2 =" Create Account" )


        }


    }
}


@Preview(showBackground = true  )
@Composable
fun WelcomeScreenPreview(){
    WelcomeScreen()
}