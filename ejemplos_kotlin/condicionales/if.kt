package condicionales
fun main(){
    print("Cuanto dinero tienes en la cartera?\n")
    var dinero = readLine()!!.toInt()
    if(dinero<20)
        print("tienes que sacar dinero")
    else
        print("tienes dinero, a por brabas")
}