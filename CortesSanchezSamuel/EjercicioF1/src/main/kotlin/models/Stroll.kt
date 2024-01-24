import models.Piloto

class Stroll(
    override val nombre: String="Lance Stroll",
    override val probabilidadAccidente: Int=20,
    override var tiempo: Int=0

) : Piloto {

    override fun inicializarPiloto(parrilla: Array<Array<Piloto?>>) {
        parrilla[3][0]=this
    }


}

