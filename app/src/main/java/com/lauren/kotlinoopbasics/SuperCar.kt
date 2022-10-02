package com.lauren.kotlinoopbasics

class SuperCar(brand: String, model: String, year: Int) : Car(brand, model, year) {
    fun property(){
        println("it goes 380 Km/h")
    }
    fun insurance(){
        println("it has 5 years insurance")
    }
}