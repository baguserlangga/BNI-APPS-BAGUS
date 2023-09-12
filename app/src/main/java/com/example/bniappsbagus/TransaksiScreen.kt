package com.example.bniappsbagus

import android.graphics.drawable.Icon
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons.Default
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.bniappsbagus.model.TransaksiEvent
import com.example.bniappsbagus.model.TransaksiState


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TransaksiScreen ( state: TransaksiState,
                      onEvent:(TransaksiEvent)->Unit){
    Scaffold(floatingActionButton = {
        FloatingActionButton(onClick = {
//            onEvent(ContactEvent.showDialog)
        }
        )
        {

        }
    }, modifier = Modifier.padding(16.dp)
    ) { padding ->
        LazyColumn(contentPadding = padding,
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        )
        {
            items(state.Transaksi){ transaksi->
                Row(modifier = Modifier.fillMaxWidth())
                {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(text = "${transaksi.bank} merchant ${transaksi.merchant}"
                            , fontSize = 20.sp)
                        Text(text = transaksi.nominal.toString())

                    }
                }
            }

        }

    }
}