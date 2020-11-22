package tipos_datos

fun main(){
    print("Bienvenido al sistema, ingrese su nombre: ")
    /*A parte de la premisa de ser conciso, kotlin tambien busca la seguridad*/
    /* la doble exclamación fuerza a que reciba el string, existe el problema de null*/
    var nombre = readLine()
    print("cuantos años tienes: ")
    var edad = readLine()!!.toInt()
    print("Cuanto dinero tienes en la cartera?: ")
    var dinero = readLine()!!.toFloat()
    print("Un saludo $nombre, tienes $edad y $dinero")

    /*Suma dos numeros*/
}