package com.example.mainactifity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mainactifity.component.ButtonWithIcon
import com.example.mainactifity.component.CornerCutShapeButton
import com.example.mainactifity.component.EditTextExample
import com.example.mainactifity.component.ElevatedButtonExample
import com.example.mainactifity.component.ImageViewExample
import com.example.mainactifity.component.NotOutlinedEditFiledExample
import com.example.mainactifity.component.RoundCornerCutShapeButton
import com.example.mainactifity.ui.theme.MainActifityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainActifityTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxSize()
                            .padding(start = 12.dp, end = 12.dp)
                    ){
                        EditTextExample()
                        NotOutlinedEditFiledExample()
                        ButtonWithIcon()
                        CornerCutShapeButton()
                        RoundCornerCutShapeButton()
                        ElevatedButtonExample()
                        ImageViewExample()

                    }
                }
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainActifityTheme {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize()
                .padding(start = 12.dp, end = 12.dp)
        ){
            EditTextExample()
            NotOutlinedEditFiledExample()
            ButtonWithIcon()
            CornerCutShapeButton()
            RoundCornerCutShapeButton()
            ElevatedButtonExample()
            ImageViewExample()

        }
    }
}