package com.example.cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.example.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

        with(amb){
            salvarBt.setOnClickListener{
                var sexo = if(sexoRg.checkedRadioButtonId == masculinoRb.id )
                    masculinoRb.text.toString() else femininoRb.text.toString()

                val pessoa = Formulario(nomeEt.text.toString(), telefoneEt.text.toString(), emailEt.text.toString(), comunicacaoCb.isChecked, sexo, cidadeEt.text.toString(), UFSpinner.selectedItem.toString())
                Toast.makeText(
                    this@MainActivity,
                    pessoa.toString(),
                    Toast.LENGTH_SHORT
                ).show()
                }

            limparBt.setOnClickListener{
                nomeEt.text.clear()
                telefoneEt.text.clear()
                emailEt.text.clear()
                comunicacaoCb.isChecked = false
                sexoRg.check(masculinoRb.id)
                cidadeEt.text.clear()
                UFSpinner.setSelection(0)
            }
            }
        }
    }