package com.example.bniappsbagus.model.testcase1

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao

interface DataTransaksiDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransaksi(transaksiQrs: DataTransaksiQr)
    @Delete
    suspend fun deleteTransaksi(transaksiQrs: DataTransaksiQr)


    @Query("SELECT * FROM datatransaksiqr ORDER BY id ASC")
    fun getContactOrderdByFirstname(): kotlinx.coroutines.flow.Flow<List<DataTransaksiQr>>
    @Query("SELECT * FROM datatransaksiqr ORDER BY id ASC ")
    fun getContactOrderdByLastname(): kotlinx.coroutines.flow.Flow<List<DataTransaksiQr>>
}