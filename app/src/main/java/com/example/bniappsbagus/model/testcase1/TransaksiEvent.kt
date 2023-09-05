package com.example.bniappsbagus.model.testcase1

sealed interface TransaksiEvent {
    object saveTransaksi : TransaksiEvent
    data class SetFirstName(val firstName: String) : TransaksiEvent
    data class SetLastName(val lastName: String) : TransaksiEvent
    data class SetPhoneNumber(val phoneNumber: String): TransaksiEvent

    object showDialog : TransaksiEvent
    object HideDialog : TransaksiEvent

//    data class SortContacts(val sortType: SortType) : TransaksiEvent
//    data class DeleteContact(val contact: DataTransaksiQr) : TransaksiEvent
}