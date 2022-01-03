package com.abifarhan.mycalculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abifarhan.mycalculatorapp.ui.theme.MyCalculatorAppTheme
import com.abifarhan.mycalculatorapp.ui.theme.Shapes

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
    androidx.compose.material.Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .clip(
                shape =
                CircleShape.copy(all = CornerSize(12.dp))
            ),
        color = Color(0xFFDFB3F2)
//            .background(color = Color)
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Total Per Person")
            Text(text = "$134")
        }
    }
}
