package com.diaz.jonathan.tarjetas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnAbrir:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnAbrir = findViewById(R.id.btnPracticar)

        btnAbrir.setOnClickListener {
            val abrirPractica = Intent(this,PracticaActivity::class.java)

            startActivity(abrirPractica)
        }

    }
}