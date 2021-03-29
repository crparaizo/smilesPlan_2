package com.example.smiles_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            //Abrindo a tela de Login
            startActivity(Intent(this@MainActivity, Login::class.java)) //Alt + Enter para importar uma classe
            //Finalizando a Splash - pois ao se usar o Intent, é aberto uma tela em cima da outra, pesando no desempenho
            finish()
        }, 3000)
    }
}