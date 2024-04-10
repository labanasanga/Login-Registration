package com.labanasanga.loginregistration

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
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

class Register_Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginRegistrationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    RegisterActivity()
                }
            }
        }
    }
}

@Composable
fun RegisterActivity() {
    var First_Name by remember { mutableStateOf("") }
    var Surname by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var Phone by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var password2 by remember { mutableStateOf("") }
var context= LocalContext.current
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp)
            .background(color = Color.Gray)
    ){
        Text(text = "Chatter Box Registration",
            color = Color.Unspecified,
            fontFamily = FontFamily.SansSerif,
            fontSize = 30.sp,
        )
        OutlinedTextField(value = First_Name,
            onValueChange ={First_Name=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "name") },

            label = { Text(text = "Enter First Name",
                color = Color.Black,
                fontSize = 20.sp)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),

            )
        OutlinedTextField(value = Surname,
            onValueChange ={Surname=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "name2") },

            label = { Text(text = "Enter Middle Name",
                color = Color.Black,
                fontSize = 20.sp)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
        )
        OutlinedTextField(value = email,
            onValueChange ={email=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },

            label = { Text(text = "Enter email",
                color = Color.Black,
                fontSize = 20.sp)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
        )
        OutlinedTextField(value = Phone,
            onValueChange ={Phone=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "phone") },

            label = { Text(text = "Enter Phone Number",
                color = Color.Black,
                fontSize = 20.sp)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
        )
        OutlinedTextField(value = password,
            onValueChange ={password=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "password") },

            label = { Text(text = "Enter Password",
                color = Color.Black,
                fontSize = 20.sp)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
        )
        OutlinedTextField(value = password2,
            onValueChange ={Phone=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "password2") },

            label = { Text(text = "Confirm Password",
                color = Color.Black,
                fontSize = 20.sp)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
        )



        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /*TODO*/ },
            //color = Color.Red,
            modifier = Modifier
                .background(color = Color.Red)
                .fillMaxWidth()) {
            Text(text = "REGISTER",
                fontSize = 20.sp)
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
            Text(text = "Click To Login",
                fontSize = 20.sp)
        }
    }

    }
    

@Preview
@Composable
fun Registerprev() {
    RegisterActivity()

}