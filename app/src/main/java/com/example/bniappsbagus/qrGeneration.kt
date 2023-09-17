package com.example.bniappsbagus

import android.R
import android.graphics.Bitmap
import android.graphics.Color
import android.provider.Settings.Global.getString
import com.google.zxing.BarcodeFormat
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.google.zxing.integration.android.IntentIntegrator
import com.google.zxing.qrcode.QRCodeWriter


fun qrGeneration (qrText:String){
    val writer = QRCodeWriter()
    try {
        val bitMatrix: BitMatrix = writer.encode(qrText, BarcodeFormat.QR_CODE, 564, 564)
        val width = bitMatrix.width
        val height = bitMatrix.height
        val bmp = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565)
        for (x in 0 until width) {
            for (y in 0 until height) {
                bmp.setPixel(x, y, if (bitMatrix[x, y]) Color.BLACK else Color.WHITE)
            }
        }
//        bitmap = bmp(findViewById(R.id.qrImage) as ImageView).setImageBitmap(bmp)
    } catch (e: WriterException) {
        e.printStackTrace()
    }


}
