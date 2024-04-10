package com.labanasanga.loginregistration

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.labanasanga.loginregistration.ui.theme.LoginRegistrationTheme

class Simple_List_Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleListview()
        }
    }
}
private val namelist= mutableListOf("Porsche","BMW","Mercedes","Audi","Mitsubishi","Toyota")

private val listModifier= Modifier
    .fillMaxSize()
    .background(Color.Black)
    .padding(30.dp)

private val textstyle= TextStyle(fontSize = 25.sp, color = Color.White)

@Composable
fun SimpleListview() {
    LazyColumn(modifier = listModifier){
        items(namelist){

                jina ->
            Text(text = jina, style = textstyle)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun MyList() {
    SimpleListview()
}