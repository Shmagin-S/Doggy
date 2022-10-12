package com.shmagins.photomagic.ui

import android.app.Activity
import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            prevedMedved("serejenka")
        }
    }
}

@Composable
fun prevedMedved(name: String){
    Text(text = "preved ebanii medved $name")
}