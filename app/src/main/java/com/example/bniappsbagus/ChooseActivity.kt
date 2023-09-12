package com.example.bniappsbagus

import android.content.ContentValues.TAG
import android.graphics.Paint.Style
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.bniappsbagus.model.TransaksiEvent
import com.example.bniappsbagus.ui.theme.BNIAPPSBagusTheme
import org.w3c.dom.Text

class ChooseActivity :  ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val onEvent : (TransaksiEvent)-> Unit
            val transaksi = intent.getStringExtra("transaksi")
            BNIAPPSBagusTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(horizontalAlignment =Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Row() {
                            if (transaksi!=null)
                            {
                                var str = transaksi.toString()
                                var delimiter = "."

                                val parts = str.split(delimiter)
                                Log.d(TAG, "onCreatessss:"+ parts.toString())
//                                Text(text = parts.toString())
                                parts.forEachIndexed{index, s ->
                                    if(index==0)
                                    {
                                        TransaksiEvent.SetBank(Bank = s)
                                    }
                                    else if(index==1)
                                    {
                                        TransaksiEvent.SetIdTransaksi(idTransaksi = s)
                                    }
                                    else if(index==2)
                                    {
                                        TransaksiEvent.SetMerchant(merchant = s)
                                    }
                                    else if(index==3)
                                    {
                                        TransaksiEvent.SetNominal(nominal = s.toInt())
                                    }
                                }


                            }

                            else
                            {

                            }


                        }
                            Row(){

                                Button(onClick = {
                                    TransaksiEvent.saveTransaksi
                                                 },modifier = Modifier.fillMaxWidth()) {
                                    Text(text = "Bayar")

                                }
                            }

                            Row() {
                                Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth().background(Color.Red)) {
                                    Text(text = "batal")

                                }
                            }


                    }

                }
            }
        }
    }
}