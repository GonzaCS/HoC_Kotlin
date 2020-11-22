package Clases

/*
Definir un objeto nombrado:
object Mayor {
con tres métodos llamados "maximo" con dos parámetros cada uno. Los métodos difieren en que uno recibe tipos de datos
Int, otro de tipos Float y finalmente el último recibe tipos de datos Double. Los tres métodos deben retornar el mayor
de los dos datos que reciben.
 */

object Mayor {
    fun maximo(x1: Int, x2: Int) = if (x1 > x2) x1 else x2
    fun maximo(x1: Float, x2: Float) = if (x1 > x2) x1 else x2
    fun maximo(x1: Double, x2: Double) = if (x1 > x2) x1 else x2
}

fun main(parametro: Array<String>) {
    println(Mayor.maximo(4, 5))
    println(Mayor.maximo(10.2f, 23.5f))
    println(Mayor.maximo(4.5, 5.2))
}