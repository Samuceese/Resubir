package models

import Checo
import Verstappen
import kotlin.random.Random

class RedBull : Escuderia("RedBull", Verstappen(), Checo()) {

    override fun ejecutarEventos() {
        if (vueltaRapida()) {
            // Realizar acciones específicas para vuelta rápida en RedBull
        }
    }

    private fun vueltaRapida(): Boolean{
        val random=Random.nextInt(100)
        if (random<10) {
            println("$nombre ha hecho una vuelta rápida")
            return true
        }
        return false
    }
}