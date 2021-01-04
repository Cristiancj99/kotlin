package com.example.firstaplicattionkotlin

class Car (private var model:String, private var year:Int) {

    public fun getModel(): String {
        return this.model
    }
    public fun getYear() : Int{
        return year
    }
}