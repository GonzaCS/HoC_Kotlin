package condicionales

fun main(){
    var num = arrayOf("peras", "manzanas", "chocolate")
    for((index, value) in num.withIndex()){
        println("el elemento nº${index+1} es $value")
    }
}