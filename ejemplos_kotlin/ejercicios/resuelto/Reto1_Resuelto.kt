
/*
Crea un nuevo proyecto en Kotlin y nómbralo RecipesMaker.

Crea un menú que muestre las siguientes opciones:
//////////////////////////////////////////////////////////
:: Bienvenido a Recipe Maker ::


Selecciona la opción deseada
1. Hacer una receta
2. Ver mis recetas
3. Salir
//////////////////////////////////////////////////////////

El programa deberá ser capaz de leer la respuesta del usuario e imprimirla, la única forma de salir de él y terminarlo es con la opción 3.

*/

fun main(args: Array<String>){
    menu()
}
private fun menu(){
    var opcion:String
    do{
        print("\n\n" +
                ":: Bienvenido a Recipe Maker ::\n"+
                "\t\tMenu\n" +
                "1.\tHacer una receta\n" +
                "2.\tVer mis recetas\n" +
                "3.\tSalir\n" +
                "\n Escribe aquí: ")
        opcion = readLine()!!.toString()
        when(opcion){
            "1" -> println("\tCreando nueva Receta...")
            "2" -> println("\tCargando recetas...")
            "3" -> println("\tAdios :D")
        }
    }while(!opcion.equals("3"))
}