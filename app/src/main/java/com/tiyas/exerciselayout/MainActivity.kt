package com.tiyas.exerciselayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.tiyas.exerciselayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    buat variabel untuk aktifin bindingnya
    /**
     * Caraa membuat viewBinding
     * 1. Buat var untuk binding activity
     * 2. Kita atur setContentView nya
     * 3. Ketika kita akan memanggil viewnya , tinggal panggil varBinding.view.method
     */
    private lateinit var  binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        2. menggunakan mainBinding
        binding.btnMain.setOnClickListener {
            Toast.makeText(this, "Ini adalah toast", Toast.LENGTH_SHORT).show()
//            tambahkan intent untuk navigasi layarnya(dari main activity ke list activity)
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }


        binding.textView.text = "Ini adalah latihan"

//        cara memannggil id kedalam file logic kita , ada 2 cara
//        1. cara menggunakan findViewById

/**
          val button = findViewById<Button>(R.id.btn_main)
          button.setOnClickListener {
          Toast.makeText(this, "Ini adalah toast", Toast.LENGTH_SHORT).show()
          }
**/

    }
}

//fun main(){
//    val car = Car("avanza", 900)
//    println(car.getCar())
//
//    val myCar = Car("Daihatsu", 700)
//    println(myCar.getCar())
//}