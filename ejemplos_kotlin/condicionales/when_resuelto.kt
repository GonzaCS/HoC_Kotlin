package condicionales

/*Plantear una estructura que se repita 5 veces y dentro de la misma
    cargar 3 valores enteros. Acumular solo el mayor del cada lista de tres valores.*/
fun main() {
    var x = 11
    var y = 13
    var z = 10
    for(i in 0..4){
        when {
            x > y && y > z -> println("$x es el mayor")
            x > z && x > y-> println("$x es el mayor")
            y > z -> println("$y es el mayor")
            else -> println("$z es el mayor")
        }
    }
}