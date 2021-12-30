package com.abifarhan.mycalculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.abifarhan.mycalculatorapp.ui.theme.MyCalculatorAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                Text(text = "Hello Again")
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {

    MyCalculatorAppTheme {
        MyApp {
            content()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyCalculatorAppTheme {
        MyApp {
            Text(text = "Hello Again")
        }
    }
}

@Preview
@Composable
fun TopHeader() {
    androidx.compose.material.Surface() {
        Column {

        }
    }
}
