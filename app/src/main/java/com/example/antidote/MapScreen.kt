package com.example.antidote

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.antidote.components.CBottomNav
import com.example.antidote.ui.theme.Purple5

@Composable
fun MapScreen() {
    Surface(color = Color.Black) { // Set a light gray background (optional)
        CBottomNav()
        Column(modifier = Modifier.fillMaxSize()) { // Use Column for vertical stacking
            // Image filling the entire screen
            Text(
                text = "Hospitals",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Purple5, // Adjust color for visibility on image
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp)
                    .padding(start = 10.dp)// Add top padding
            )

            Text(
                text = "Find hospital near your address",
                fontSize = 18.sp,
                color = Color.White, // Adjust color for visibility on image
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Image(
                painter = painterResource(R.drawable.map), // Ensure image resource exists
                contentDescription = "Content description for the image",
                modifier = Modifier
                    .fillMaxWidth() // Fill the width of the column
                    .padding(horizontal = 10.dp) // Add horizontal padding
                    .padding(vertical = 8.dp), // Add vertical padding
                contentScale = ContentScale.FillWidth // Adjust content scale
            )

            // Text on top of the image (optional)

            // Navigation Bar at the Bottom
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MapScreenPreview() {
    MapScreen()
}
