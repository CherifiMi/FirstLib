package com.example.lib

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
public fun MitoLibBox() {
    Box(modifier = Modifier.size(80.dp).background(Color.Red)){
        Box(modifier = Modifier.fillMaxSize().padding(20.dp).background(Color.Yellow)){

        }
    }
}