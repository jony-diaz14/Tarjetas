package com.diaz.jonathan.tarjetas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class PracticaActivity : AppCompatActivity() {

    var factor1:Int = 0
    var factor2:Int = 0
    var producto:Int = 0
    var RC = false

    lateinit var tvFactor1:TextView
    lateinit var tvFactor2:TextView
    lateinit var etResultado:EditText
    lateinit var btnCalcular:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practica)
        initUI()
        //generarMultiplicaion()

        btnCalcular.setOnClickListener {
            val strResultado = etResultado.text.toString()
            if (strResultado.equals("")){
                Toast.makeText(this, "Dejaste el campo vacio", Toast.LENGTH_SHORT).show()
            }else{
                //continuacion
                RC = producto == strResultado.toInt()
                generarMultiplicaion()
                val mostraR = Intent(this, ResultadoActivity::class.java)
                mostraR.putExtra("correcto",RC)
                startActivity(mostraR)
            }
        }

    }
    fun initUI(){
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
        tvFactor1.text = "$factor1"
        tvFactor2.text = "$factor2"
        etResultado.text.clear()
    }
}