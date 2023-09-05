package com.example.bniappsbagus.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bniappsbagus.model.testcase1.DataTransaksiDao
import com.example.bniappsbagus.model.testcase1.TransaksiEvent
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch

class DataTransaksiViewModel(private val dao: DataTransaksiDao): ViewModel() {


    fun onEvent(event: TransaksiEvent){
        when(event){
//            TransaksiEvent.saveTransaksi ->{
//                val firstName = state.value.firstName
//                val lastName = state.value.lastName
//                val phoneNumber = state.value.phoneNumber
//            }

            else -> {

            }
        }
    }
}