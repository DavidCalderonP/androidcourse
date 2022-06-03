package com.example.mvvm

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.mvvm.activities.*
import com.google.android.material.snackbar.Snackbar
import java.time.LocalDateTime
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private var preventDoubleClickMode: Boolean = false
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val date = Date()
        val ldt = LocalDateTime.now()
        Log.i("date", ldt.toString())
        Log.i("date", date.toString())

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button10 = findViewById<Button>(R.id.button10)
//        val button11 = findViewById<Button>(R.id.button11)
//        val button12 = findViewById<Button>(R.id.button12)
//        val button13 = findViewById<Button>(R.id.button13)
//        val button14 = findViewById<Button>(R.id.button14)
//        val button15 = findViewById<Button>(R.id.button15)
//        val button16 = findViewById<Button>(R.id.button16)
//        val button17 = findViewById<Button>(R.id.button17)
//        val button18 = findViewById<Button>(R.id.button18)
//
        button1.setOnClickListener() {
            if (!preventDoubleClickMode) {
                goToActivity1()
            }
            preventDoubleClickMode = true
        }

        button2.setOnClickListener() {
            if (!preventDoubleClickMode) {
                goToActivity2()
            }
            preventDoubleClickMode = true
        }

        button3.setOnClickListener() {
            if (!preventDoubleClickMode) {
                goToActivity3()
            }
            preventDoubleClickMode = true
        }

        button4.setOnClickListener() {
            if (!preventDoubleClickMode) {
                goToActivity4()
            }
            preventDoubleClickMode = true
        }

        button5.setOnClickListener() {
            if (!preventDoubleClickMode) {
                goToActivity5()
            }
            preventDoubleClickMode = true
        }

        button6.setOnClickListener() {
            if (!preventDoubleClickMode) {
                goToActivity6()
            }
            preventDoubleClickMode = true
        }

        button7.setOnClickListener() {
            if (!preventDoubleClickMode) {
                goToActivity7()
            }
            preventDoubleClickMode = true
        }

        button8.setOnClickListener() {
            if (!preventDoubleClickMode) {
                goToActivity8()
            }
            preventDoubleClickMode = true
        }

        button9.setOnClickListener() {
            if (!preventDoubleClickMode) {
                goToActivity9()
            }
            preventDoubleClickMode = true
        }

        button10.setOnClickListener() {
            if (!preventDoubleClickMode) {
                goToActivity10()
            }
            preventDoubleClickMode = true
        }
        Log.w("Mainasdfghjkl", "onCREATE!")
    }

    override fun onStart() {
        super.onStart()
        Log.w("Mainasdfghjkl", "onSTART!")
    }

    override fun onResume() {
        super.onResume()
        preventDoubleClickMode = false
        Log.w("Mainasdfghjkl", "onRESUME!")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Mainasdfghjkl", "onPAUSE!")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Mainasdfghjkl", "onSTOP!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Mainasdfghjkl", "onDESTROY!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Mainasdfghjkl", "onRESTART!")
    }

    fun showToast() {
        Toast.makeText(this, "Toast", Toast.LENGTH_LONG).show()
    }

    fun showSnackbar() {
        val layout = findViewById<ConstraintLayout>(R.id.constraint)
        Snackbar.make(layout, "Main text", Snackbar.LENGTH_LONG).setAction("UNDO!") {
            Snackbar.make(layout, "Secondary text", Snackbar.LENGTH_LONG).show()
        }.show()
    }

    private fun goToActivity1() = startActivity(Intent(this, Activity1::class.java))
    private fun goToActivity2() = startActivity(Intent(this, Activity2::class.java))
    private fun goToActivity3() = startActivity(Intent(this, Activity3::class.java))
    private fun goToActivity4() = startActivity(Intent(this, Activity4::class.java))
    private fun goToActivity5() = startActivity(Intent(this, Activity5::class.java))
    private fun goToActivity6() = startActivity(Intent(this, Activity6::class.java))
    private fun goToActivity7() = startActivity(Intent(this, Activity7::class.java))
    private fun goToActivity8() = startActivity(Intent(this, Activity8::class.java))
    private fun goToActivity9() = startActivity(Intent(this, Activity9::class.java))
    private fun goToActivity10() = startActivity(Intent(this, Activity10::class.java))
}

