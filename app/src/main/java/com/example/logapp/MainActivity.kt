package com.example.logapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        log("Meu primeiro log");

        Log.i("PADRAO", "Vazando LOG")
    }

    fun log(texto: String, tag:String = "PADRAO") {

        if(BuildConfig.DEBUG) {
            Log.i(tag, texto);
        }
    }
}