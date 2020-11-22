package condicionales

fun main(){
    print("Escribe dos numeros\n")
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var mayor = if(num1>num2) num1 else num2
    print("El numero mayor de $num1 y $num2 es $mayor")


}