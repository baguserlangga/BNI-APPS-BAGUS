package com.example.bniappsbagus

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dynamsoft.dce.CameraEnhancer
import com.example.bniappsbagus.ui.theme.BNIAPPSBagusTheme
import com.journeyapps.barcodescanner.ScanOptions

class MainActivity : ComponentActivity() {
    private lateinit var mCameraEnhancer: CameraEnhancer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BNIAPPSBagusTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column() {
                        Row(verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center) {
                            Button(onClick = {
                                val intent = Intent(this@MainActivity, ScanQrActivity::class.java)
                                startActivity(intent)
                            }) {
                                Text(text = "Scan QR")
                            }


                        }
                        Row(verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center) {
                            Button(onClick = {
                                Toast.makeText(
                                    this@MainActivity,
                                    "toasting",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }) {
                                Text(text = "Lihat Promo")
                            }
                        }
                        Row(verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center) {
                            Button(onClick = {
                                Toast.makeText(
                                    this@MainActivity,
                                    "toasting",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }) {
                                Text(text = "Lihat Histori")
                            }
                        }
                    }


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BNIAPPSBagusTheme {
        Greeting("Android")
    }
}
