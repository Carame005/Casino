package juegos

abstract class Juego (val nombre : String, var monto : Int){

    abstract fun iniciarJuego()

     fun apostar(cantidad : Int): Boolean{
         if (cantidad <= monto){
             monto -= cantidad
         }
         else{
             println("Quiere apostar más de lo que tiene")
             return false
         }
         return true
     }

    fun esPar(numero : Int) : Boolean{
        return if (numero % 2 == 0){
            true
        } else{
            false
        }
    }


    abstract fun mostrarResultados()

}