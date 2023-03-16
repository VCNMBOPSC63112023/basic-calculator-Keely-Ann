package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaring variables
        var editTextNumber1 = findViewById<EditText>(R.id.editTextNumber1)
        var editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)
        var textViewDisplay = findViewById<TextView>(R.id.textViewDisplay)

        //Buttons
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract= findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)

        val btnPower = findViewById<Button>(R.id.btnPower)
        val btnSquareRoot = findViewById<Button>(R.id.btnSquareRoot)

        //Addition Button
        btnAdd?.setOnClickListener {
            Toast.makeText(this@MainActivity,"Addition button clicked", Toast.LENGTH_LONG).show()
            var number1 = editTextNumber1.text.toString().toInt()
            var number2 = editTextNumber2.text.toString().toInt()

            var totalAdd: Number=0
            totalAdd=number1 + number2
            textViewDisplay.text = "Add: ${editTextNumber1.text} + ${editTextNumber2.text}= $totalAdd"
        }

            //Subtraction Button
            btnSubtract?.setOnClickListener {
                Toast.makeText(this@MainActivity,"Subtraction button clicked", Toast.LENGTH_LONG).show()
                var number1 = editTextNumber1.text.toString().toInt()
                var number2 = editTextNumber2.text.toString().toInt()

                var totalSubtract: Number=0
                totalSubtract=number1 - number2
                textViewDisplay.text = "Subtract: ${editTextNumber1.text} - ${editTextNumber2.text}= $totalSubtract"
            }

                //Multiplication Button
                btnMultiply?.setOnClickListener {
                    Toast.makeText(this@MainActivity,"Multiplication button clicked", Toast.LENGTH_LONG).show()
                    var number1 = editTextNumber1.text.toString().toInt()
                    var number2 = editTextNumber2.text.toString().toInt()

                    var totalMultiply: Number=0
                    totalMultiply=number1 * number2
                    textViewDisplay.text = "Multiply: ${editTextNumber1.text} * ${editTextNumber2.text} = $totalMultiply"
                }

                    //Division Button
                    btnDivide?.setOnClickListener {
                        Toast.makeText(this@MainActivity,"Division button clicked", Toast.LENGTH_LONG).show()
                        var number1 = editTextNumber1.text.toString().toInt()
                        var number2 = editTextNumber2.text.toString().toInt()

                        var totalDivide: Number=0

                        if(number2 == 0){
                            textViewDisplay.text = "Value cannot be zero, try again!"
                        }
                        else{
                            totalDivide=number1 / number2
                            textViewDisplay.text = "Divide: ${editTextNumber1.text} / ${editTextNumber2.text} = $totalDivide"
                        }
                    }

        //Power button
        btnPower?.setOnClickListener {    Toast.makeText(this@MainActivity, "Power button clicked", Toast.LENGTH_LONG).show()
            var number1=editTextNumber1.text.toString().toInt()
            var number2=editTextNumber2.text.toString().toInt()
            var totalPower: Number=0
            totalPower= number1.toDouble().pow(number2.toDouble())
            textViewDisplay.text ="Power: ${editTextNumber1.text} to the power of ${editTextNumber2.text}= $totalPower "}

        //Square root button
        btnSquareRoot?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Square root button clicked", Toast.LENGTH_LONG).show()
            var number1=editTextNumber1.text.toString().toDouble()
            var totalSquareRoot: Number=0
            totalSquareRoot= sqrt(number1)
            textViewDisplay.text ="Square root: √${editTextNumber1.text} = $totalSquareRoot "}
        }
    }