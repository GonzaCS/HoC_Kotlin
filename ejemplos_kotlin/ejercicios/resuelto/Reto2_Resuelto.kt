

val ingredientes: List<String> =
    listOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")

fun main(){
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
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            "3" -> println("\tAdios :D")
        }
    }while(!opcion.equals("3"))
}

fun makeRecipe(){
    println("Hacer una receta")
    println("Selecciona por categoria el ingrediente que buscas")
    for((indice,ingrediente) in ingredientes.withIndex()){
        println("${indice+1}. $ingrediente")
    }
    //println("${ingredientes.size}. Finalizar receta")
}

fun viewRecipe(){
    println("Ver mis recetas")
}