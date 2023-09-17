package com.example.bniappsbagus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.example.bniappsbagus.model.DataTransaksiQr
import com.example.bniappsbagus.model.TransaksiQrDB
import com.example.bniappsbagus.viewmodel.DataTransaksiViewModel

class TransaksiActivity :  ComponentActivity() {
    private val db by lazy{
        Room.databaseBuilder(
            applicationContext,
            TransaksiQrDB::class.java,
            "datatransaksiqr.db"
        ).allowMainThreadQueries().build()
    }
    private val viewModel by viewModels<DataTransaksiViewModel>(
        factoryProducer = {
            object : ViewModelProvider.Factory{
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return DataTransaksiViewModel(db.dao) as T
                }
            }
        }
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val state by viewModel.state.collectAsState()
            TransaksiScreen(state = state, onEvent = viewModel::onEvent )
        }
    }
}