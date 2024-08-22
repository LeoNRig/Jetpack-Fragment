package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.fragments.fragments.ChamadasFragment
import com.example.fragments.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnMercado: Button
    private lateinit var btnChamadas: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMercado = findViewById(R.id.btn_mercado)
        btnChamadas = findViewById(R.id.btn_chamadas)

//        val fragmentManager = supportFragmentManager.beginTransaction()
//
////        Diversas alterações em fragments
//        fragmentManager.add(R.id.fragment_conteudo, ConversasFreagment())
//
//        fragmentManager.commit()
//        val conversasFragment =

//        val conversasFragment = ConversasFragment()

        btnMercado.setOnClickListener{
//            val conversasFragment = ConversasFragment()
//            val bundle = bundleOf(
//                "categoria" to "mercado",
//                "usuarios" to "Leonardo"
//            )
//            conversasFragment.arguments = bundle
//            supportFragmentManager
//                .beginTransaction()
//                .replace(R.id.fragment_conteudo, conversasFragment)
//                .commit()
            val bundle = bundleOf(
                "categoria" to "mercado",
                "usuarios" to "Leonardo"
            )
            supportFragmentManager.commit{
                replace<ConversasFragment>(R.id.fragment_conteudo, args = bundle)
            }

        }
        btnChamadas.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, ChamadasFragment())
//                .remove(conversasFragment)
                .commit()
        }


    }
}