package com.diaz.jonathan.tarjetas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView

class ResultadoActivityO : AppCompatActivity() {
        lateinit var animView: LottieAnimationView
        lateinit var btnRegreso:Button

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_o)

            animView = findViewById(R.id.animation_view)

            val extras = intent.extras
            val respuestaC = extras!!.getBoolean("correcto")
            if (respuestaC){
                animView.setAnimation(R.raw.bien)
            }else{
                animView.setAnimation(R.raw.wrong_bici)
            }

            btnRegreso = findViewById(R.id.btnRegreso)

            btnRegreso.setOnClickListener {
                val btnRegreso = Intent(this,PracticaActivity::class.java)

                startActivity(btnRegreso)
            }


        }
    }