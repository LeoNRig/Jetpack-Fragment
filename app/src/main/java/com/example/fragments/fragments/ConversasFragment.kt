package com.example.fragments.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragments.R
import org.w3c.dom.Text

//class ConversasFragment: Fragment(R.layout.fragment_convesas) {
class ConversasFragment: Fragment() {

    private lateinit var btnExecutar: Button
    private lateinit var editText: EditText
    private lateinit var textCategoria: TextView
    private lateinit var textResultado: TextView

    private var categoria: String? = null
    private var usuarios: String? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("ciclo de vida","onAtach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo de vida","onCreate")

        categoria = arguments?.getString("categoria")
        usuarios = arguments?.getString("usuarios")

    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_convesas,
            container,
            false
        )

        btnExecutar = view.findViewById(R.id.btn_executar)
        editText = view.findViewById(R.id.editTextNome)
        textResultado = view.findViewById(R.id.resultado)
        textCategoria = view.findViewById(R.id.text_categorias)

        textCategoria.text = categoria
        textResultado.text = usuarios

        btnExecutar.setOnClickListener{
            val nome =  editText.text.toString()
            textResultado.text = nome
        }


//        view.findViewById<>()
        return view
    }

//    fun logar(){
//
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("ciclo de vida","onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo de vida","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo de vida","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo de vida","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo de vida","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("ciclo de vida","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo de vidao","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("ciclo de vidao","onDetach")
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)

//    }



}