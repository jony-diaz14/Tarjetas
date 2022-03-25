package com.diaz.jonathan.tarjetas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class PracticaActivity : AppCompatActivity() {

    var factor1:Int = 0
    var factor2:Int = 0
    var producto:Int = 0

    lateinit var tvFactor1:TextView
    lateinit var tvFactor2:TextView
    lateinit var etResultado:EditText
    lateinit var btnCalcular:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practica)

        tvFactor1 = findViewById(R.id.tvFactor1)
        tvFactor2 = findViewById(R.id.tvFactor2)
        etResultado = findViewById(R.id.etResultado)
        btnCalcular = findViewById(R.id.btnVerificar)

        generarMultiplicaion()

    }
    fun generarMultiplicaion(){
        factor1 = Random.nextInt(0,10)
        factor2 = Random.nextInt(0,10)
        producto = factor1 * factor2
    }
}