package com.lauren.kotlinoopbasics

class Office:House() {

    fun thePrice(){
        super.price()
    }
    override fun price(){
        println("it is 4000")
    }
}