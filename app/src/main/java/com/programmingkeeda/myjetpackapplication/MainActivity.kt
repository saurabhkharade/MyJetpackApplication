package com.programmingkeeda.myjetpackapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.programmingkeeda.myjetpackapplication.ui.theme.MyJetpackApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyJetpackApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Programming Keeda", modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hello", fontSize = 25.sp, color = Color.Red)
        Text("Programming Keeda!", fontSize = 25.sp, color = Color.Red)

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Hello", fontSize = 25.sp, color = Color.Red)
            Text("Programming Keeda!", fontSize = 25.sp, color = Color.Red)
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyJetpackApplicationTheme {
        Greeting("Android")
    }
}