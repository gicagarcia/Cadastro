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

        setSupportActionBar(amb.mainTb)
        supportActionBar?.title = getString(R.string.app_name)

        amb.estadoCivilSp.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(position == 2){
                    amb.conjugeLl.visibility = View.VISIBLE
                }else{
                    amb.conjugeLl.visibility = View.GONE
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        with(amb){
            salvarBt.setOnClickListener{
                "Nome completo: ${nomeEt.text} ${sobrenomeEt.text}".also {
                    Toast.makeText(
                        this@MainActivity,
                        it,
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}