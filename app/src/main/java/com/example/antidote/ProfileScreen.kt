package com.example.antidote

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.antidote.components.CBottomNav
import com.example.antidote.ui.theme.Purple1
import com.example.antidote.ui.theme.Purple2
import com.example.antidote.ui.theme.Purple3
import com.example.antidote.ui.theme.Purple4
import com.example.antidote.ui.theme.Purple40
import com.example.antidote.ui.theme.Purple5

@Composable
fun ToDoTaskCard(task: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        shape = RoundedCornerShape(8.dp), // Rounded corners for card
        colors =  CardDefaults.cardColors(
            containerColor = Color.White, // Card background color
            // contentColor = Color.White  // Card content color, e.g. text
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f) // Make the text take up remaining space
            ) {
                Text(
                    text = "Medical Tracker",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.height(8.dp))
                // Display the task name
                Text(
                    text = task,
                    fontSize = 16.sp,
                    color = Color.Black,
                )
            }
            Spacer(modifier = Modifier.width(8.dp)) // Add space between text and icon
            Icon(
                imageVector = Icons.Default.ArrowForward, // Use the arrow forward icon from Material Icons
                contentDescription = "Arrow Forward", // Provide a content description for accessibility
                tint = Color.Black // Set the color of the icon
            )
        }
    }
}

@Composable
fun ProfileScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color.Black
    ) {
        CBottomNav()
        Column(modifier = Modifier.fillMaxSize()){
            // Header (Optional)
            Spacer(modifier = Modifier.height(24.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 16.dp)
            ){
                Image(
                    painter = painterResource(R.drawable.profile),
                    contentDescription = null, // Provide a proper content description if needed
                    modifier = Modifier
                        .size(100.dp) // Set the size of the image
                        .clip(CircleShape) // Clip the image with a circular shape
                        .border(2.dp, Color.White, CircleShape), // Add a border if needed
                    contentScale = ContentScale.Crop // Adjust content scale as needed
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    Text(
                        text = "Jenny Bond",
                        fontSize = 30.sp,
                        color = Purple4,
                        fontWeight = FontWeight(700),
                        modifier = Modifier.padding(horizontal = 16.dp),
                    )

                    Text(
                        text = "22 years old",
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 16.dp),
                    )
                }



            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                shape = RoundedCornerShape(8.dp), // Rounded corners for card
                colors =  CardDefaults.cardColors(
                    containerColor = Purple2, //Card background color
                    // contentColor = Color.White  //Card content color,e.g.text
                )
            ){
                Column(
                    modifier = Modifier.padding(16.dp) // Add padding to the Column
                ) {
                    Text(
                        text = "Address",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    // Dummy address details
                    Text(
                        text = "12 Main St\nMelbourne, Victoria, 3000",
                        fontSize = 16.sp,
                        color = Color.Black,
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End, // Align the icon to the end (right) of the row
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(
                            onClick = { /* Handle edit icon click */ },
                            modifier = Modifier.size(24.dp) // Set the size of the icon
                        ) {
                            Icon(
                                imageVector = Icons.Default.Edit, // Use the edit icon from Material Icons
                                contentDescription = "Edit", // Provide a content description for accessibility
                                tint = Color.Black // Set the color of the icon
                            )
                        }
                    }
                }
            }

            val todoTasks = listOf(
                "Day 1",
                "Day 2",
                "Day 3",
                "Day 4",
                // Add more tasks as needed
            )
            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(horizontal = 1.dp, vertical = 8.dp)
            ) {
                items(todoTasks.size) { index ->
                    ToDoTaskCard(task = todoTasks[index])
                }
            }

            // Button with Add icon
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.End, // Align the button to the end (right) of the row
                verticalAlignment = Alignment.CenterVertically
            ){
                Button(
                    onClick = { /* Handle add button click */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Purple40),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                ){
                    Icon(
                        imageVector = Icons.Default.Add, // Use the add icon from Material Icons
                        contentDescription = "Add", // Provide a content description for accessibility
                        tint = Color.White // Set the color of the icon
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Add space between icon and text
                    Text(
                        text = "Add Progress", // Text for the button
                        color = Color.White // Set the color of the text
                    )
                }
            }











        }

    }
}


@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview(){
    ProfileScreen()
}