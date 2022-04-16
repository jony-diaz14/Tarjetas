package com.diaz.jonathan.tarjetas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class ResultadoActivity : AppCompatActivity() {
    lateinit var animView: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        animView = findViewById(R.id.animation_view)

        val extras = intent.extras
        val respuestaC = extras!!.getBoolean("correcto")
        if (respuestaC){
            animView.setAnimation(R.raw.bien)
        }else{
            animView.setAnimation(R.raw.wrong_bici)
        }


    }
}