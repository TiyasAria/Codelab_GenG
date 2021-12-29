package com.tiyas.exerciselayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.tiyas.exerciselayout.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {

    private lateinit var  listBinding: ActivityListBinding

    private var nameRookies = arrayOf("Afina", "Jasmine", "Fiona", "Dista" ,
        "Annisa", "Tiyas", "Anggi" , "Meysi" ,"Tjandra")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listBinding = ActivityListBinding.inflate(layoutInflater)
        setContentView(listBinding.root)

        listBinding.lvName.adapter = ArrayAdapter(this, R.layout.item_list, nameRookies )

//        untuk item ketika di klik
        listBinding.lvName.setOnItemClickListener { parent, view, index, id ->
            Toast.makeText(this, "Anda memilih : ${nameRookies[index]}", Toast.LENGTH_SHORT).show()
        }

    }
}