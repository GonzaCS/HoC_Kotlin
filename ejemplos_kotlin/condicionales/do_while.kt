package condicionales

fun main(){
    print("Escribe un número ")
    var numero = readLine()!!.toInt()
    do {
        print("$numero ")
        numero--
    }while(numero>0)
}