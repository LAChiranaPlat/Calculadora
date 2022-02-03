package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var views:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        views= ActivityMainBinding.inflate(layoutInflater)

        val c1=views.cant1
        val c2=views.cant2

        setContentView(views.root)

        views.btnPlus.setOnClickListener { v->

            val result=c1.text.toString().toInt() + c2.text.toString().toInt()

            Toast.makeText(this,result.toString(),Toast.LENGTH_SHORT).show()

        }

        views.btnLess.setOnClickListener { v->

            val result=c1.text.toString().toInt() - c2.text.toString().toInt()

            Toast.makeText(this,result.toString(),Toast.LENGTH_SHORT).show()
        }

    }
}