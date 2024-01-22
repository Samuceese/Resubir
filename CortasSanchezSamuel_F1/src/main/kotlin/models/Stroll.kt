import models.Piloto

class Stroll(
    override val nombre: String="Lance Stroll",
    override val probabilidadAccidente: Int=20
) : Piloto {

    override fun inicializarPiloto(parrilla: Array<Array<Piloto?>>) {
        parrilla[3][0]=this
    }


}

