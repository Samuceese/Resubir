package models

import kotlin.random.Random

interface Piloto {

    val nombre: String
    val probabilidadAccidente: Int
    var tiempo: Int

    fun inicializarPiloto(parrilla: Array<Array<Piloto?>>)

    fun avanzarPosicion(parrilla: Array<Array<Piloto?>>) {
        for (i in parrilla.indices) {
            for (j in parrilla[i].indices) {
                if (parrilla[i][j] == this) {
                    if (j == 4) {
                        val tiempoPitStop = hacerPitStop()
                        tiempo += tiempoPitStop.toInt() / 1000
                    }
                    if (Random.nextInt(100) < probabilidadAccidente) {
                        println("$nombre ha tenido un accidente desastroso y queda fuera de la carrera.")
                        parrilla[i][j] = null
                    } else {
                        if (j < parrilla[i].size - 1 && parrilla[i][j + 1] == null) {
                            parrilla[i][j] = null
                            parrilla[i][j + 1] = this
                        } else if (j == parrilla[i].size - 1) {
                            parrilla[i][j] = null
                            parrilla[i][(j + 1) % parrilla[i].size] = this
                        }
                    }
                    tiempo += 1
                    break
                }
            }
        }
    }


    private fun hacerPitStop(): Long {
        val pausa = (1..3).random() * 1000L
        println("$nombre realiza un pit stop con una duración de ${pausa/1000} segundos.")
        Thread.sleep(pausa)
        return pausa
    }

}