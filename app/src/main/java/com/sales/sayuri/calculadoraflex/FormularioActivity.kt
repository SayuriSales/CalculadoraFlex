package com.sales.sayuri.calculadoraflex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        btLimpar.setOnClickListener {
            inputAlcool.editText?.setText("")
            inputGasolina.editText?.setText("")
            inputAlcool.editText?.requestFocus()
        }

        btCalcular.setOnClickListener{
            val telaResultado = Intent(this, ResultadoActivity::class.java)

            telaResultado.putExtra("ALCOOL",
                    inputAlcool.editText?.text.toString())

            telaResultado.putExtra("GASOLINA",
                    inputGasolina.editText?.text.toString())

            startActivity(telaResultado)
        }


    }
}
