package com.operations.suma1;

fun main(){
    var number: Int = 0;

    for (i in 1..5) {
        println("Ingrese un número para sumar:")
        var curr = readLine()?.toInt()
        if (curr != null) number = number + curr
    }

    println(number)
}
