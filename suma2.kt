package com.operations.suma2;

fun main(){
    println("Ingrese la cantidad de numeros a sumar:")
    var quantity: Int = readLine()?.toInt()!!
    var number: Int = 0;

    for (i in 1..quantity) {
        println("Ingrese un número para sumar:")
        var curr = readLine()?.toInt()
        if (curr != null) number = number + curr
    }

    println(number)
}