package com.example.mvvm.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.mvvm.MainActivity
import com.example.mvvm.R
import com.example.mvvm.models.Student

class IntentExtrasActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_extras)

        toolbar = findViewById(R.id.extratoolbar)
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true);
        supportActionBar!!.setDisplayShowHomeEnabled(true);




        val name = intent.getStringExtra("name")
        val lastname = intent.getStringExtra("lastname")
        val age = intent.getIntExtra("age", -1)
        val developer = intent.getBooleanExtra("developer", false)
        inExtras(name, lastname, age, developer)

        val student = intent.getParcelableExtra<Student>("student")
        student?.let{
            val checkBox = findViewById<CheckBox>(R.id.checkBox)
            findViewById<TextView>(R.id.textViewName).text = student.name
            findViewById<TextView>(R.id.textViewLastname).text = student.lastname
            findViewById<TextView>(R.id.textViewAge).text = student.age.toString()
            checkBox.visibility = View.VISIBLE
            checkBox.text = "I'm a developer"
            checkBox.isChecked = student.dev
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        return true
    }

    fun inExtras(name: String?, lastname: String?, age: Int, developer: Boolean){
        if (name != null && lastname !=null && age>0){
            val checkBox = findViewById<CheckBox>(R.id.checkBox)
            findViewById<TextView>(R.id.textViewName).text = name
            findViewById<TextView>(R.id.textViewLastname).text = lastname
            findViewById<TextView>(R.id.textViewAge).text = "$age"
            checkBox.text = "I'm a developer"
            checkBox.isChecked = developer
        }else{
            findViewById<CheckBox>(R.id.checkBox).visibility = View.INVISIBLE
        }
    }
    fun goBack(v: View){
        startActivity(Intent(this, Activity4::class.java))
    }
}