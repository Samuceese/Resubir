package models

abstract class Escuderia(val nombre: String, val piloto1: Piloto, val piloto2: Piloto) {
    abstract fun ejecutarEventos()
}