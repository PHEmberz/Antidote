package com.example.antidote

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.antidote.components.CBottomNav


@Composable
fun HomeScreen() {
    Surface(color = Color.LightGray) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Header (Optional)
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Hello there, Bhavya Singh Gahlawat!",
                fontSize = 40.sp,
                color = Color.Black,
                fontWeight = FontWeight(700),
                modifier = Modifier.padding(horizontal = 16.dp, ),
            )
            Spacer(modifier = Modifier.height(24.dp))

            // Large Card for Next Dose (static, no timer functionality)
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp) // Set a larger height for the card
                    .padding(vertical = 8.dp, horizontal = 16.dp),

                shape = RoundedCornerShape(8.dp),
//                elevation = 4.dp,
//                backgroundColor = Color.White // Set background color explicitly
            ) {
                Box(modifier = Modifier.padding(16.dp)) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(
                            text = "Next Dose:",
                            fontSize = 18.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "1:57 hrs", // Placeholder time, remove functionality
                            fontSize = 32.sp, // Set larger font size for timer
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Flu Medication", // Placeholder medication name
                            fontSize = 16.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }


            // LazyColumn for Cards
            LazyColumn(
                modifier = Modifier.weight(1f),
                contentPadding = PaddingValues(horizontal = 16.dp, )
            ) {
                items(4) { index ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        shape = RoundedCornerShape(8.dp),

                        ) {
                        Column(modifier = Modifier.padding(16.dp)) { // Replace CardContent with Column

                            when (index) {
                                0 -> {
                                    Text(text = "Update Medical Information", fontSize = 18.sp, color = Color.Black)
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(text = "Manage your medications, appointments, and diagnoses.", fontSize = 14.sp, color = Color.Gray)
                                }
                                1 -> {
                                    Text(text = "Allergen Information", fontSize = 18.sp, color = Color.Black)
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(text = "View and update your list of allergies.", fontSize = 14.sp, color = Color.Gray)
                                }
                                2 -> {
                                    Text(text = "Emergency Contacts", fontSize = 18.sp, color = Color.Black)
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(text = "Add and manage your emergency contacts.", fontSize = 14.sp, color = Color.Gray)
                                }
                                3 -> {
                                    Text(text = "Journal", fontSize = 18.sp, color = Color.Black)
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(text = "Keep track of illness symptoms and reactions to medication.", fontSize = 14.sp, color = Color.Gray)
                                }
                            }
                        }
                    }
                }
            }

            // Navigation Bar
            BottomAppBar(
//                backgroundColor = Color(0xFF007BFF),
                content = {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth().padding(
                            horizontal = 80.dp, vertical= 4.dp
                        )
//                        padding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        IconButton(onClick = { /* Home button click action */ }) {
                            Icon(Icons.Filled.Home, contentDescription = "Home", tint = Color.Blue) // Tint the icon blue
                        }


                        IconButton(onClick = { /* Map button click action */ }) {
                            Icon(Icons.Filled.LocationOn, contentDescription = "Map")
                        }
                    }
                }
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}
