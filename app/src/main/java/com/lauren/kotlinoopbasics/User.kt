package com.lauren.kotlinoopbasics

class User:Company {
    var name : String? = null
    var age : Int? = null

    constructor(nameInput:String, ageInput:Int){
        this.age = ageInput
        this.name = nameInput
    }
    init {
        println("init worked")
    }
}