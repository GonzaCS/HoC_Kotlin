package condicionales

fun main(){
    print("Escribe un número ")
    var numero = readLine()!!.toInt()
    while(numero>0) {
        print("$numero ")
        numero--
    }
}