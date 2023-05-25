package com.example.projetoesgapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main3)

        val btnDicas = findViewById<Button>(R.id.btnDicas)

        btnDicas.setOnClickListener{
            val i = Intent (this, MainActivity4::class.java)
            startActivity(i)
        }

        val btnDicasIcon = findViewById<ImageButton>(R.id.btnDicasIcon)

        btnDicasIcon.setOnClickListener{
            val i = Intent (this, MainActivity4::class.java)
            startActivity(i)
        }

        val btnPontuacao = findViewById<Button>(R.id.btnPontuacao)

        btnPontuacao.setOnClickListener{
            val i = Intent (this, MainActivity7::class.java)
            startActivity(i)
        }

        val btnPontuacaoIcon = findViewById<ImageButton>(R.id.btnPontuacaoIcon)

        btnPontuacaoIcon.setOnClickListener{
            val i = Intent (this, MainActivity7::class.java)
            startActivity(i)
        }

        val btnBonificacao = findViewById<Button>(R.id.btnBonificacao)

        btnBonificacao.setOnClickListener{
            val i = Intent (this, MainActivity9::class.java)
            startActivity(i)
        }

        val btnPremiosIcon = findViewById<ImageButton>(R.id.btnPremiosIcon)

        btnPremiosIcon.setOnClickListener{
            val i = Intent (this, MainActivity9::class.java)
            startActivity(i)
        }

    }
}

