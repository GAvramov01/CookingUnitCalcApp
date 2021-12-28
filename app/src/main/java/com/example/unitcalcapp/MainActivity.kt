package com.example.unitcalcapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tablespoonsNum = arrayOf(1, 3, 4, 5.5, 6, 8, 11, 12, 16, 32, 64, 80, 96, 128)
        var chouseNumber = ""

        val calculateButton : Button = findViewById(R.id.calculate_button)
        calculateButton.setOnClickListener {
            click(chouseNumber)
        }

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,tablespoonsNum)

        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                chouseNumber = tablespoonsNum[p2].toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
//                TODO("Not yet implemented")
            }

        }
    }

    @SuppressLint("SetTextI18n")
    fun click(chouseNumber: String) {

        val cupResult: TextView = findViewById(R.id.cup_result)
        val ouncesResult: TextView = findViewById(R.id.ounces_result)
        val mililitersResult: TextView = findViewById(R.id.mililiters_result)

        when (chouseNumber) {
            "1" -> {
                cupResult.text = "1/16 cup"
                ouncesResult.text = "1/2 oz"
                mililitersResult.text = "15 ml"
            }
            "3" -> {
                cupResult.text = "1/8 cup"
                ouncesResult.text = "1 oz"
                mililitersResult.text = "30 ml"
            }
            "4" -> {
                cupResult.text = "1/4 cup"
                ouncesResult.text = "2 oz"
                mililitersResult.text = "59 ml"
            }
            "5.5" -> {
                cupResult.text = "1/3 cup"
                ouncesResult.text = "2.5 oz"
                mililitersResult.text = "79 ml"
            }
            "6" -> {
                cupResult.text = "3/8 cup"
                ouncesResult.text = "3 oz"
                mililitersResult.text = "90 ml"
            }
            "8" -> {
                cupResult.text = "1/2 cup"
                ouncesResult.text = "4 oz"
                mililitersResult.text = "118 ml"
            }
            "11" -> {
                cupResult.text = "2/3 cup"
                ouncesResult.text = "5 oz"
                mililitersResult.text = "158 ml"
            }
            "12" -> {
                cupResult.text = "3/4 cup"
                ouncesResult.text = "6 oz"
                mililitersResult.text = "177 ml"
            }
            "16" -> {
                cupResult.text = "1 cup"
                ouncesResult.text = "8 oz"
                mililitersResult.text = "240 ml"
            }
            "32" -> {
                cupResult.text = "2 cup"
                ouncesResult.text = "16 oz"
                mililitersResult.text = "480 ml"
            }
            "64" -> {
                cupResult.text = "4 cup"
                ouncesResult.text = "32 oz"
                mililitersResult.text = "960 ml"
            }
            "80" -> {
                cupResult.text = "5 cup"
                ouncesResult.text = "40 oz"
                mililitersResult.text = "1180 ml"
            }
            "96" -> {
                cupResult.text = "6 cup"
                ouncesResult.text = "48 oz"
                mililitersResult.text = "1420 ml"
            }
            "128" -> {
                cupResult.text = "8 cup"
                ouncesResult.text = "64 oz"
                mililitersResult.text = "1895 ml"
            }

        }
    }


}