package com.example.snake

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.snake.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var params = intent.extras
        var continuar = params?.getBoolean("pausa")

        if (continuar == true) {
            binding.botaoContinuar.visibility = View.VISIBLE
        } else {
            binding.botaoContinuar.visibility = View.INVISIBLE
        }


        binding.apply {
            botaoNovojogo.setOnClickListener {
                var intent = Intent(this@MainActivity, Tabuleiro::class.java)
                startActivity(intent)
            }
            botaoConfigurar.setOnClickListener {
                val intent = Intent(this@MainActivity, Configurar::class.java)
            }

            botaoContinuar.setOnClickListener {
                val intent = Intent()
                setResult(Activity.RESULT_OK, intent)
                finish()
            }

        }
    }
}