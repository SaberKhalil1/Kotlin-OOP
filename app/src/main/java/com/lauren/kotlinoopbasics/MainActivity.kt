package com.lauren.kotlinoopbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User("salih",25)
        user.age = 50
        user.name = "Mohammed"
        user.member()
        println(user.age)
        println(user.name)

        //Encapsulation
        val car = Car("Bmw","320",2020)
        car.model = "520"
        println(car.brand)
        println(car.model)

        //Inheritance

        val superCar = SuperCar("Opel","Astra",2018)

        println(superCar.brand)
        println(superCar.model)
        println(superCar.year)

        superCar.property()
        superCar.insurance()

        //polymorphism
        //Static
        val math = Math()
        println(math.sum())
        println(math.sum(2,3))
        println(math.sum(6,2,9))

        //Dynamic
        val house = House()
        house.price()
        val office = Office()
        office.thePrice()
        office.price()

        //Abstract & Interface
        val family = Family()

        family.members = "Five"
        family.workers = "Two"
        family.name

        family.mom()
        println(family.members)
        println(family.workers)
        println(family.name)



    }
}