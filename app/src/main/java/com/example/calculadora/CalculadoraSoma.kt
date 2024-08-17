package com.example.calculadora

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class CalculadoraSoma : Activity() {
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        Log.v("CALCULADORA", "onCreate executado!")

        setContentView(R.layout.calculadora_soma_layout)

        val numero1 = findViewById<EditText>(R.id.num1)
        val numero2 = findViewById<EditText>(R.id.num2)
        val botao = findViewById<Button>(R.id.btnSomar)

        botao.setOnClickListener {
            var num1 = numero1.text.toString().toDoubleOrNull()
            var num2 = numero2.text.toString().toDoubleOrNull()
            if (num1 == null) {
                num1 = 0.0
            }
            if (num2 == null) {
                num2 = 0.0
            }
            val resultado = num1 + num2
            Log.v("CALCULADORA", "Soma: $resultado")
        }
    }
}