
fun main(){
    var numbers: MutableList<Int> = mutableListOf()

    while (numbers.size < 5) {
        println("Ingrese un número para sumar:")
        var curr = readLine()
        if (curr?.toInt() != null) numbers.add(curr.toInt())
    }

    println(numbers.reduce{ acc, num -> acc + num }) 
}
