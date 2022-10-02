package com.lauren.kotlinoopbasics

class Family() : Dad,Mom {
    override var name: String
        get() = "Daddy"
        set(value) {}
    var members :String? =null
    var workers :String? =null
}