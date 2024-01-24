package models

import LeClerc
import Sainz

class Ferrari : Escuderia("Ferrari", Sainz(), LeClerc()) {
    override fun ejecutarEventos() {
    }
}