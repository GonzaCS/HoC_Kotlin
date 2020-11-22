
fun selMode():String{
    print("selecciona un modo: \n suma: + \n multiplicación: * \n division: / \n resto: % \n  ")
    return readLine()!!
}

fun suma(num1:Int, num2:Int) =  num1 + num2

fun mul(num1:Int, num2:Int) = num1 * num2

fun div(num1:Int, num2:Int) = num1 / num2

fun resto(num1:Int, num2:Int) = num1 % num2


fun main(){
    print("ingrese los numeros que quiere sumar: \n")
    var numero1 = readLine()!!.toInt()
    var numero2 = readLine()!!.toInt()
    var mode = selMode()
    var salida = when(mode){
        "+" -> suma(numero1, numero2)
        "*" -> mul(numero1, numero2)
        "/" -> div(numero1, numero2)
        "%" -> resto(numero1, numero2)
        else -> null
    }
    if(salida != null){
        print("el resultado de $numero1 $mode $numero2 es $salida  ")
    }
    else{
        print("La operación no se ha podido llevar a cabo")
    }

}