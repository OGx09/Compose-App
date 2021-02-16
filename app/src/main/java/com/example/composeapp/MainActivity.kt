package com.example.composeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.platform.setContent
import com.example.composeapp.ui.BasicsCodelabTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import org.w3c.dom.NameList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }


    @Composable
    fun MyApp(content: @Composable () -> Unit){
        BasicsCodelabTheme {
            Surface(color = Color.DarkGray) {
                content();
            }
        }
    }


    @Composable
    fun MyScreenContent(names: List<String> = List(1000) { "Hello Android #$it" }) {
        val counterState = remember { mutableStateOf(0) }
        Column(modifier = Modifier.fillMaxHeight()) {

        }
    }

    @Composable
    fun Counter(count: Int, updateCount : (Int) -> Unit){
        Button(
            onClick = {updateCount(count +1)},
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (count > 5) Color.Green else Color.White
            )
        ){
            Text("I have counted $count");
        }
    }


    @Preview("MyScreen preview")
    @Composable
    fun DefaultPreview() {
        MyApp {
            MyScreenContent()
        }
    }
}