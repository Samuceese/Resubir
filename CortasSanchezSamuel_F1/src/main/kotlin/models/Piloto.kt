package models

import kotlin.random.Random

interface Piloto {

    val nombre: String
    val probabilidadAccidente: Int

    fun inicializarPiloto(parrilla: Array<Array<Piloto?>>)

    fun avanzarPosicion(parrilla: Array<Array<Piloto?>>) {
        for (i in parrilla.indices) {
            for (j in parrilla[i].indices) {
                if (parrilla[i][j] == this) {
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
                    break
                }
            }
        }
    }

}