package models

import Alonso
import Checo
import Hamilton
import LeClerc
import Russel
import Sainz
import Stroll
import Verstappen

private const val NUM_FILAS=8
private const val NUM_COLUMNAS=10
private const val MAX_VUELTAS=3
private const val PAUSE_TIME=1000L
private const val MAX_TIME=29

class Circuito{

    val alonso = Alonso()
    val stroll = Stroll()
    val verstappen = Verstappen()
    val checo = Checo()
    val hamilton = Hamilton()
    val russel = Russel()
    val sainz = Sainz()
    val leClerc = LeClerc()

    private val parrilla = Array(NUM_FILAS) { arrayOfNulls<Piloto?>(NUM_COLUMNAS) }
    private val corredores = arrayOf(alonso, stroll, verstappen, checo, hamilton, russel, sainz, leClerc)

    init {
        alonso.inicializarPiloto(parrilla)
        stroll.inicializarPiloto(parrilla)
        verstappen.inicializarPiloto(parrilla)
        checo.inicializarPiloto(parrilla)
        hamilton.inicializarPiloto(parrilla)
        russel.inicializarPiloto(parrilla)
        sainz.inicializarPiloto(parrilla)
        leClerc.inicializarPiloto(parrilla)
        mostrarParrilla()
    }



    private fun mostrarParrilla(){
        println("------------------------------------------------------------------------------------")
        for (i in parrilla.indices){
            for (j in parrilla[i].indices){
                when(parrilla[i][j]){
                    is Alonso -> print("[A 🟦🏎️]")
                    is Stroll -> print("[S 🟦🏎️]")
                    is Verstappen -> print("[V ⬛🏎️]")
                    is Checo -> print("[C ⬛🏎️]")
                    is Hamilton -> print("[H 🟩🏎️]")
                    is Russel -> print("[R 🟩🏎️]")
                    is Sainz -> print("[S 🟥🏎️]")
                    is LeClerc -> print("[L 🟥🏎️]")
                    else -> print("[      ]")
                }
            }
            println()
        }
        println("------------------------------------------------------------------------------------")

    }

    fun darSalida() {
        println("🔴🔴🔴🔴 ARRANQUEN SUS MOTORES 🔴🔴🔴🔴")
        var contador = 3

        do {
            println(contador)

            if (contador == 1)
                println("🟢🟢🟢🟢 YAAAAAAAAAAAAAAAAAAA 🟢🟢🟢🟢")

            Thread.sleep(PAUSE_TIME)
            contador--
        } while (contador > 0)
    }


    fun simular(){
        var tiempo=0
        do {

            alonso.avanzarPosicion(parrilla)
            stroll.avanzarPosicion(parrilla)
            verstappen.avanzarPosicion(parrilla)
            checo.avanzarPosicion(parrilla)
            hamilton.avanzarPosicion(parrilla)
            russel.avanzarPosicion(parrilla)
            sainz.avanzarPosicion(parrilla)
            leClerc.avanzarPosicion(parrilla)
            mostrarParrilla()

            Thread.sleep(PAUSE_TIME)
            tiempo++
        }while (tiempo< MAX_TIME )
        burbuja(corredores)
        mostrarPodio()
    }

    fun burbuja(array: Array<Piloto>) {
        var aux: Piloto
        for (i in 0 until array.size) {
            for (j in 0 until array.size - 1) {
                if (array[j].tiempo < array[j + 1].tiempo) {
                    aux = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = aux
                }
            }
        }
    }


    fun mostrarPodio() {
        println("🏆🥇 Podio al final de la carrera 🥇🏆")
        for (i in 0 until 3) {
            val piloto = corredores[i]
            println("${i + 1}. ${piloto.nombre} - Tiempo: ${piloto.tiempo} segundos")
        }
    }



}