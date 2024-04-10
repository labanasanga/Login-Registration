package com.labanasanga.loginregistration

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.telecom.Call
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
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
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat
import com.labanasanga.loginregistration.ui.theme.LoginRegistrationTheme

class Intent_Activity : ComponentActivity() {
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
                    IntentActivity()
                }
            }
        }
    }
}

@Composable
fun IntentActivity() {
    var SMS by remember { mutableStateOf("") }
    var Call by remember { mutableStateOf("") }
    var dial by remember { mutableStateOf("") }
    var camera by remember { mutableStateOf("") }
    var mpesa by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var share by remember { mutableStateOf("") }
    var context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp)
            .background(color = Color.Gray)
    ) {
        Text(
            text = "Chatter Box INTENT",
            color = Color.LightGray,
            fontFamily = FontFamily.SansSerif,
            fontSize = 30.sp,
        )

        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = {
                val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

                startActivityForResult(context as Activity,takePictureIntent,1,null)


            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),


            shape = RoundedCornerShape(32.dp),
           // modifier = Modifier.fillMaxWidth()

        ) {
            Text(text = "CAMERA",
                color = Color.Gray,
                fontSize = 30.sp)


        }
        Spacer(modifier = Modifier.height(40.dp))

        OutlinedButton(
            onClick = {
                val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254797630636"))

                if (ContextCompat.checkSelfPermission(
                        context,
                        android.Manifest.permission.CALL_PHONE
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    ActivityCompat.requestPermissions(
                        context as Activity,
                        arrayOf(android.Manifest.permission.CALL_PHONE),
                        1
                    )
                } else {
                    context.startActivity(intent)
                }
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            shape = RoundedCornerShape(32.dp),
           // modifier = Modifier.fillMaxWidth()

        ) {
            Text(text = "Call",
                color = Color.Gray,

                fontSize = 30.sp)




        }
        Spacer(modifier = Modifier.height(40.dp))

        OutlinedButton(
            onClick = {
                val uri = Uri.parse("smsto:0798162561")

                val intent = Intent(Intent.ACTION_SENDTO, uri)

                intent.putExtra("Hello", "How is todays weather")

                context.startActivity(intent)
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            shape = RoundedCornerShape(32.dp),
           // modifier = Modifier.fillMaxWidth()

        ) {
            Text(text = "SMS",
                color = Color.Gray,

                fontSize = 30.sp)


        }
        Spacer(modifier = Modifier.height(40.dp))

        OutlinedButton(
            onClick = {
                val simToolKitLaunchIntent =
                    context.packageManager.getLaunchIntentForPackage("com.android.stk")

                simToolKitLaunchIntent?.let { context.startActivity(it) }
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            shape = RoundedCornerShape(32.dp),
           // modifier = Modifier.fillMaxWidth()

        ) {
            Text(text = "M-PESA",
                color = Color.Gray,

                fontSize = 30.sp)


        }
        Spacer(modifier = Modifier.height(40.dp))

        OutlinedButton(
            onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)

                shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

                shareIntent.type = "text/plain"

                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

                context.startActivity(shareIntent)
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            shape = RoundedCornerShape(32.dp),
           // modifier = Modifier.fillMaxWidth()

        ) {
            Text(text = "Share",
                color = Color.Gray,

                fontSize = 30.sp)


        }
        Spacer(modifier = Modifier.height(40.dp))

        OutlinedButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            shape = RoundedCornerShape(32.dp),
           // modifier = Modifier.fillMaxWidth()

        ) {
            Text(text = "Email",
                color = Color.Gray,

                fontSize = 30.sp)


        }
        Spacer(modifier = Modifier.height(40.dp))

        OutlinedButton(
            onClick = {
                val phone = "+254 798162561"

                val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

                context.startActivity(intent)
            },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            shape = RoundedCornerShape(32.dp),
            //modifier = Modifier.fillMaxWidth()

        ) {
            Text(text = "DIAL",
                color = Color.Gray,

                fontSize = 30.sp)


        }

    }
}

@Preview
@Composable
fun Intentprev() {
    IntentActivity()
}
