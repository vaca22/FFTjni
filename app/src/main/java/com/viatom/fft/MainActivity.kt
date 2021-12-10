package com.viatom.fft


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import uk.me.berndporr.kiss_fft.KISSFastFourierTransformer
import java.lang.Math.sin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("fuck",sin(Math.PI/2).toString())
        val xx=DoubleArray(100){
            sin((it+1.0).toDouble()/10*2*Math.PI)
        }
        val fuck=KISSFastFourierTransformer.transform(xx)
        for((k,j) in fuck.withIndex()){
            Log.e("gg"+k,"${j.real}           ${j.imaginary}")
        }
    }
}