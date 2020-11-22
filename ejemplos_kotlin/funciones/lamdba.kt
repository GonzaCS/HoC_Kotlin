package funciones

    fun main(){

        val w = {d:Int, c:Int -> d+c}
        println(w(1,3))
        println({d:Int, c:Int -> d+c}(1,2))
    }