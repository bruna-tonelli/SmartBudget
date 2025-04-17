package com.example.smartbudget

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.smartbudget.databinding.ActivityAdicionarreceitaBinding

class AdicionarReceitaActivity : AppCompatActivity() {

    // Variável para o ViewBinding
    private lateinit var binding: ActivityAdicionarreceitaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()
        // Inicializa o ViewBinding
        binding = ActivityAdicionarreceitaBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}