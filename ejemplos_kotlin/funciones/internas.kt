package funciones

/*Confeccionar una función que permita cargar dos enteros y nos muestre el mayor de ellos. Realizar esta actividad con 5 pares de valores.
Implementar una función interna que retorne el mayor de dos enteros.*/

fun mayor() {
    fun mayorB (x1: Int, x2: Int) = if (x1 > x2) x1 else x2

    for(i in 1..5) {
        print("Ingrese primer numero:")
        val valor1 = readLine()!!.toInt()
        print("Ingrese segundo numero:")
        val valor2 = readLine()!!.toInt()
        println("El mayor entre $valor1 y $valor2 es ${mayorB(valor1, valor2)}")
    }
}

fun main(parametro: Array<String>) {
    mayor()
}
