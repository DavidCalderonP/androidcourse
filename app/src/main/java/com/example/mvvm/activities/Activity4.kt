package com.example.mvvm.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.annotation.RequiresApi
import com.example.mvvm.R
import com.example.mvvm.models.Student
import java.time.LocalDate
import java.util.*

class Activity4 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val extra = findViewById<Button>(R.id.buttonextras)
        val flag = findViewById<Button>(R.id.buttonflags)
        val objects = findViewById<Button>(R.id.buttonobject)

        extra.setOnClickListener(){intentExtras()}
        flag.setOnClickListener(){intentFlags()}
        objects.setOnClickListener(){intentObject()}

        Log.w("Activity4", "onCREATE!")
    }

    private fun intentExtras(){
        val intent = Intent(this, IntentExtrasActivity::class.java)
        intent.putExtra("name", "David")
        intent.putExtra("lastname", "Calderón")
        intent.putExtra("age", 23)
        intent.putExtra("developer",true)
        startActivity(intent)

    }
    private fun intentFlags(){
        val intent = Intent(this, IntentExtrasActivity::class.java)
        //intent.flags = Intent.FLAG_ACTIVITY_NO_HISTORY
        startActivity(intent)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun intentObject(){
        val intent = Intent(this, IntentExtrasActivity::class.java)
        val student = Student("Jahir","Beltrán", LocalDate.of(1996, 4, 12), false)
        intent.putExtra("student", student)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.w("Activity4", "onSTART!")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Activity4", "onRESUME!")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Activity4", "onPAUSE!")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Activity4", "onSTOP!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Activity4", "onDESTROY!")
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onRestart() {
        super.onRestart()
        Log.w("Activity4", "onRESTART!")
    }
}