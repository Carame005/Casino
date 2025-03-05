package juegos
import kotlin.random.Random

class Tragaperras(nombre : String,monto : Int) : Juego(nombre,monto) {
    override fun iniciarJuego() {
        var apuesta = false
        println("Ingrese una cantidad a apostar: ")
        while(apuesta == false){
            val cantidad = readLine()!!.toInt()
            apuesta = apostar(cantidad)
        }
        println(girarRuleta())
    }

    companion object{
        val SIMBOLOS_DE_RULETA = arrayOf("☆","♕","☺","♢")
    }

    fun girarRuleta(): Array<String.Companion> {
        var simbolos = arrayOf(String.Companion)
        for (i in 3){
            simbolos[i] = SIMBOLOS_DE_RULETA.random()
        }
        return simbolos
    }

    override fun mostrarResultados() {
        TODO("Not yet implemented")
    }
}