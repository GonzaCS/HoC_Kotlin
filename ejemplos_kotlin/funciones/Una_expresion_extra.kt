
fun selMod():String{
    print("selecciona un modo: \n suma: + \n multiplicación: * \n division: / \n resto: % \n  ")
    return readLine()!!
}

fun calculadora(num1:Int, num2:Int, mode:String = "+") = when(mode){
    "+" -> num1 + num2
    "*" -> num1 * num2
    "/" -> num1 / num2
    "%" -> num1 % num2
    else -> null
}

fun main(){
    print("ingrese los numeros que quiere sumar: \n")
    var numero1 = readLine()!!.toInt()
    var numero2 = readLine()!!.toInt()
    var mode = selMode()
    var salida = calculadora(numero1, numero2, mode)
        print("el resultado de $numero1 $mode $numero2 es $salida  ")
}