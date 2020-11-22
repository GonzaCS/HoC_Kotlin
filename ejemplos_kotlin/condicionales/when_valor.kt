package condicionales

fun main(parameto: Array<String>) {
    print("Ingrese un valor entero entre 1 y 5:")
    val valor = readLine()!!.toInt()
    when (valor) {
        1 -> print("uno")
        2 -> print("dos")
        3 -> print("tres")
        4 -> print("cuatro")
        5 -> print("cinco")
        else -> print("valor fuera de rango")
    }
    /* Rangos y valores concretos*/
    /* Pedir el numero de hijos a 10 familias, agruparlos en 0, 1, 2 hijos y sacarlo por pantalla*/
}