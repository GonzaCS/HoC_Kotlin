package tipos_datos

fun main(parametro: Array<String>){
    print(" Escriba cinco numeros y diremos el mayor de ellos: \n")
    var arr:IntArray = IntArray(5)
    for(i in arr.indices){
        arr[i] = readLine()!!.toInt()
    }
    print(arr.max())
}