package com.javeedishaq.newsapp.ui.screen

import android.support.v4.os.IResultReceiver
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TopNews() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Top News", fontWeight = FontWeight.SemiBold)
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    TopNews()
}