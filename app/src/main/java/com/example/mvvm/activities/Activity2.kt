package com.example.mvvm.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.mvvm.R
import kotlin.Error

class Activity2 : AppCompatActivity() {

    val img1 =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Marvel_Logo.svg/1200px-Marvel_Logo.svg.png"
    val img2 = "https://sm.ign.com/ign_es/screenshot/default/youtube-xef12j3tvbk_xtdf.jpg"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        Log.w("Activity2", "onCREATE!")
        findViewById<Button>(R.id.loadimages).setOnClickListener() {
            loadImages()
        }
    }



    private fun loadImages() {
        val top = findViewById<ImageView>(R.id.imgviewtop)
        val bot = findViewById<ImageView>(R.id.imgviewbottom)
        try {
            top.alpha = 0f
            bot.alpha = 0f
            Log.w("LOG", "Current: ${System.currentTimeMillis()}")
            Glide
                .with(this)
                .load(img1 + "?t ${System.currentTimeMillis()}")
                //.diskCacheStrategy(DiskCacheStrategy.NONE)//Con esto skipeamos el almacenamiento
                //.skipMemoryCache(true)//Con esto skipeamos la búsqueda en cache
                .into(top)
            Glide
                .with(this)
                .load(img2 + "?t ${System.currentTimeMillis()}")
                .diskCacheStrategy(DiskCacheStrategy.NONE)//Con esto skipeamos el almacenamiento
                .skipMemoryCache(true)//Con esto skipeamos la búsqueda en cache
                .into(bot)
            top.animate().setDuration(2000).alpha(1f).start()
            bot.animate().setDuration(3000).alpha(1f).start()
            Log.w("ERROR", "ERROR")
        } catch (error: Error) {
            Log.w("ERROR", "ERROR SI ENTRO AL CATCH")
        }
        Toast.makeText(this, "Se hizo lo de picaso", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.w("Activity2", "onSTART!")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Activity2", "onRESUME!")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Activity2", "onPAUSE!")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Activity2", "onSTOP!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Activity2", "onDESTROY!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Activity2", "onRESTART!")
    }
}