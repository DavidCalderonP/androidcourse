package com.example.mvvm.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import com.example.mvvm.R
import com.example.mvvm.adapters.PersonAdapter
import com.example.mvvm.models.Person
import kotlin.math.roundToInt

class Activity3 : AppCompatActivity() {

    private lateinit var personList: List<Person>
    private lateinit var adapter: PersonAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        Log.w("Activity31", "onCREATE!")
        personList = getData()
        adapter = PersonAdapter(this, R.layout.list_view_person, personList)
        val listview = findViewById<ListView>(R.id.listwiew)
        listview.adapter = adapter
    }

    override fun onStart() {
        super.onStart()
        Log.w("Activity3", "onSTART!")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Activity3", "onRESUME!")
        Log.i("INFORMACION", getData().toString())
    }

    override fun onPause() {
        super.onPause()
        Log.w("Activity3", "onPAUSE!")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Activity3", "onSTOP!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Activity3", "onDESTROY!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Activity3", "onRESTART!")
    }

    private fun getData():List<Person>{
        return listOf(
            Person("Hugo", "Hernández", (Math.random() * 100).roundToInt()),
            Person("Lucas", "García", (Math.random() * 100).roundToInt()),
            Person("Mateo", "Martínez", (Math.random() * 100).roundToInt()),
            Person("Leo", "López", (Math.random() * 100).roundToInt()),
            Person("Daniel", "González", (Math.random() * 100).roundToInt()),
            Person("Pablo", "Pérez", (Math.random() * 100).roundToInt()),
            Person("Manuel", "Rodríguez", (Math.random() * 100).roundToInt()),
            Person("Álvaro", "Sánchez", (Math.random() * 100).roundToInt()),
            Person("Adrián", "Ramírez", (Math.random() * 100).roundToInt()),
            Person("David", "Cruz", (Math.random() * 100).roundToInt()),
            Person("Mario", "Hernández", (Math.random() * 100).roundToInt()),
            Person("Enzo", "García", (Math.random() * 100).roundToInt()),
            Person("Diego", "Martínez", (Math.random() * 100).roundToInt()),
            Person("Marcos", "López", (Math.random() * 100).roundToInt()),
            Person("Izan", "González", (Math.random() * 100).roundToInt()),
            Person("Marco", "Pérez", (Math.random() * 100).roundToInt()),
            Person("Álex", "Rodríguez", (Math.random() * 100).roundToInt()),
            Person("Bruno", "Sánchez", (Math.random() * 100).roundToInt()),
            Person("Oliver", "Ramírez", (Math.random() * 100).roundToInt()),
            Person("Miguel", "Cruz", (Math.random() * 100).roundToInt()),
            Person("Thiago", "Hernández", (Math.random() * 100).roundToInt()),
            Person("Antonio", "García", (Math.random() * 100).roundToInt()),
            Person("Marco", "Martínez", (Math.random() * 100).roundToInt())
            )
    }
}