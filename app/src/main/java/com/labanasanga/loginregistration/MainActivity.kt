package com.labanasanga.loginregistration

import android.content.Intent
import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.labanasanga.loginregistration.ui.theme.LoginRegistrationTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginRegistrationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   // Greeting("Android")
                    Login()

                }
            }
        }
    }
}

@Composable
fun Login() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var context= LocalContext.current

    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp)
            .background(color = Color.Gray)
            //.background(color = Color.shape)
        ){
Text(text = "Chatter Box Login",
    color = Color.Unspecified,
    fontFamily = FontFamily.Monospace,
    fontSize = 30.sp,
    )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },
            label = {
                Text(
                    text = "Enter email",
                    color = Color.Black,
                    fontSize = 20.sp,
                    ///////////////////////////////////////////////////////////////////////////////////////////// modifier= Modifier.clickable {  }
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),


            )
        OutlinedTextField(value = password,
            onValueChange ={password=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "email") },

            label = { Text(text = "Enter password",
                color = Color.Black,
                fontSize = 20.sp)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
        )


        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent= Intent(context,Register_Activity::class.java)
            context.startActivity(intent)

        },
            modifier = Modifier
                .fillMaxWidth()) {
            Text(text = "Login",
                fontSize = 25.sp)
        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent=Intent(context,MainActivity::class.java)
            context.startActivity(intent)
        },
            //colors = ButtonCo,
            modifier = Modifier
                .background(color = Color.Cyan)
                .fillMaxWidth()) {
            Text(text = "Click To Register",
                fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent=Intent(context,Intent_Activity::class.java)
            context.startActivity(intent)
        },
            //colors = Button


            modifier = Modifier
                .background(color = Color.Cyan)
                .fillMaxWidth()) {
            Text(text = "Intents",
                fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent=Intent(context,Calculator_Activity::class.java)
            context.startActivity(intent)
        },
            //colors = ButtonCo,
            modifier = Modifier
                .background(color = Color.Cyan)
                .fillMaxWidth()) {
            Text(text = "Calculator",
                fontSize = 20.sp)
        }

}
}



@Preview
@Composable
fun Loginprev(){
    Login()
}


//Simple_List_Activity