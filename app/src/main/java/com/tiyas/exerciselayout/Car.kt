package com.tiyas.exerciselayout

data class Car(
    val brand : String ,
    val power : Int
) {
    fun getCar() = "Ini adalah $brand dengan berat $power"
}