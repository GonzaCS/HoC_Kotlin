package tipos_datos/*
* Contamos con varios tipos de variables.
* numericos:
*   Byte
*   Short
*   Int
*   Long
*
*   entre otrso tipos contamos con el tipo String.
*
* */
fun main(){
    /*
    * Para inicializar una variable se hace de la forma
    * val nombre: tipo
    * */

    val nombre: String
    val edad: Int
    val dinero: Float
    nombre = "Ángel"
    edad = 20
    dinero = 22.5f

    print("$nombre tine $edad años y $dinero€ en la cartera")

}
