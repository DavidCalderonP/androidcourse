package com.example.mvvm.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.mvvm.R

class Activity1 : AppCompatActivity() {
    var canExit = false
    var times = 7
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        Log.w("Acitvity1asdfghjkl", "onCREATE!")
        val btn1 =  findViewById<Button>(R.id.button1)
        btn1.setOnClickListener(){Toast.makeText(this, "rug3buyrbg4crh4br3", Toast.LENGTH_LONG).show()}
    }

    override fun onStart() {
        super.onStart()
        Log.w("Acitvity1asdfghjkl", "onSTART!")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Acitvity1asdfghjkl", "onRESUME!")
        Log.w("Acitvity1asdfghjkl", "Veces: $times")

    }

    override fun onPause() {
        super.onPause()
        Log.w("Acitvity1asdfghjkl", "onPAUSE!")
    }
    override fun onStop() {
        super.onStop()
        Log.w("Acitvity1asdfghjkl", "onSTOP!")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.w("Acitvity1asdfghjkl", "onDESTROY!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Acitvity1asdfghjkl", "onRESTART!")
    }
}