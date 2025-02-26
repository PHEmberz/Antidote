package com.example.antidote


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.antidote.components.CButton
import com.example.antidote.components.CTextField
import com.example.antidote.components.DontHaveAccountRow
import com.example.antidote.ui.theme.Purple1
import com.example.antidote.ui.theme.Purple5


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(){
    Surface(
//        color= Color(Black),
        modifier = Modifier.fillMaxSize()
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Black)
        ){
            Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                     modifier= Modifier
                         .padding(top = 54.dp)
                         .padding(horizontal = 24.dp)
                         .fillMaxSize()
            ){
                Spacer(modifier = Modifier.height(120.dp))
                Text(text = "A N T I D O T E" ,
                    fontSize = 32.sp,
                    fontWeight = FontWeight(700),
                    color = Purple1
                )
                Text(text = "Monash User-SIGN IN",
                   style = TextStyle( fontSize = 28.sp,
                       fontWeight = FontWeight(700),
                       color = Black
                   ),
                    modifier=  Modifier.align(Alignment.Start)
                )
                Text(text = "SIGN IN",
                    style = TextStyle( fontSize = 28.sp,
                        fontWeight = FontWeight(700),
                        color = Purple5
                    ),
                    modifier=  Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Experience wellness and emotional balance",
                    style = TextStyle( fontSize = 20.sp,
                        fontWeight = FontWeight(700),
                        color = Color.Gray
                    ),
                    modifier= Modifier
                        .align(Alignment.Start)
                        .padding(bottom = 24.dp)
                )
//                 textfield
                CTextField(hint = "Email Address", value ="" )

                CTextField(hint = "Password", value = "")
                Spacer(modifier = Modifier.height(24.dp))
                CButton(text = "Sign In")
                DontHaveAccountRow(text1 = "Don't have an account?", text2 =" Sign Up" )


            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
LoginScreen()
}
