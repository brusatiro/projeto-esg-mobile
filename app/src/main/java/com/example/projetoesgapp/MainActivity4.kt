package com.example.projetoesgapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main4)

        val btnMapaEcopontos = findViewById<Button>(R.id.btnMapaEcopontos)
        val btnBonificacao = findViewById<Button>(R.id.btnBonificacao)
        val btnPremiosIcon = findViewById<ImageButton>(R.id.btnPremiosIcon)
        val btnInicio = findViewById<Button>(R.id.btnInicio)
        val btnInicioIcon = findViewById<ImageButton>(R.id.btnInicioIcon)
        val btnPontuacao = findViewById<Button>(R.id.btnPontuacao)
        val btnPontuacaoIcon = findViewById<ImageButton>(R.id.btnPontuacaoIcon)

        btnMapaEcopontos.setOnClickListener{
            val i = Intent (this, MapsActivity::class.java)
            startActivity(i)
        }

        btnBonificacao.setOnClickListener{
            val i = Intent (this, MainActivity9::class.java)
            startActivity(i)
        }
        btnPremiosIcon.setOnClickListener{
            val i = Intent (this, MainActivity9::class.java)
            startActivity(i)
        }

        btnInicio.setOnClickListener{
            val i = Intent (this, MainActivity3::class.java)
            startActivity(i)
        }

        btnInicioIcon.setOnClickListener{
            val i = Intent (this, MainActivity3::class.java)
            startActivity(i)
        }

        btnPontuacao.setOnClickListener{
            val i = Intent (this, MainActivity7::class.java)
            startActivity(i)
        }

        btnPontuacaoIcon.setOnClickListener{
            val i = Intent (this, MainActivity7::class.java)
            startActivity(i)
        }

    }
}