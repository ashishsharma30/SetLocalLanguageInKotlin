package com.kotlin.aks.setlocallanguageinkotlin

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(ApplicationLanguageHelper.wrap(newBase!!, "es"))
//        super.attachBaseContext(ApplicationLanguageHelper.wrap(newBase!!, "en"))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
