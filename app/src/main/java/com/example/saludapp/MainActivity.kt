package com.example.saludapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.saludapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnShowName.setOnClickListener {
            checkValue()
        }
    }

    private fun checkValue(){
        if(binding.editTextTextPersonName.text.isNotEmpty()){
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("INTENT_NAME", binding.editTextTextPersonName.text)
            startActivity(intent)
        }else {
            showErrorName()
        }
    }

    private fun showErrorName(){
        Toast.makeText(this, "El nombre no debe estar vacio", Toast.LENGTH_LONG).show()

    }
}