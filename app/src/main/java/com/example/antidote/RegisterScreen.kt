import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.antidote.components.CButton
import com.example.antidote.components.CTextField
import com.example.antidote.components.CDatePicker
import com.example.antidote.components.CGenderDropdown
import com.example.antidote.components.DontHaveAccountRow
import com.example.antidote.ui.theme.Purple1
import com.example.antidote.ui.theme.Purple5
import java.util.*

enum class Gender {
    Male, Female
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(selectedDate: String = "") {

    val context = LocalContext.current

    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black)){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier= Modifier
                .padding(top = 54.dp)
                .padding(horizontal = 24.dp)
                .fillMaxSize()
        ){
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "A N T I D O T E" ,
                fontSize = 32.sp,
                fontWeight = FontWeight(700),
                color = Purple1
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "SIGN UP",
                style = TextStyle( fontSize = 28.sp,
                    fontWeight = FontWeight(700),
                    color = Purple5
                ),
                modifier=  Modifier.align(Alignment.CenterHorizontally)
            )

            Text(text = "Experience wellness and emotional balance",
                style = TextStyle( fontSize = 20.sp,
                    fontWeight = FontWeight(700),
                    color = Color.Gray
                ),
                modifier= Modifier
                    .align(Alignment.Start)
                    .padding(bottom = 24.dp)
            )

            CTextField(hint = "First Name", value = "")
            CTextField(hint = "Last Name", value = "")
            CTextField(hint = "Email Address", value ="" )
            CTextField(hint = "Password", value ="" )
            CTextField(
                hint = "Date of Birth",
                value = "",
            )
            CDatePicker(context = LocalContext.current)
            CGenderDropdown(hint = "Gender", value = "")






            Spacer(modifier = Modifier.height(24.dp))
            CButton(text = "Sign Up")
            DontHaveAccountRow(text1 = "Already have an account?", text2 =" Sign in" )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview(){
    var selectedDate by remember { mutableStateOf("") }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        RegisterScreen(selectedDate = selectedDate)
    }
}
