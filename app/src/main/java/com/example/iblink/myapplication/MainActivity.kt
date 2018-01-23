package com.example.iblink.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import org.linphone.*
import org.linphone.core.LinphoneCall

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sipaddress = findViewById<TextView>(R.id.editText2)
        val sipaddressvalue = sipaddress.text.toString()
        Log.i("address check","$sipaddressvalue")

    }
}
