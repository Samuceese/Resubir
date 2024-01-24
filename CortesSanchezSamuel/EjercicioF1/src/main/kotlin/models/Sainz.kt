import models.Piloto

class Sainz(
    override val nombre: String="Sainz",
    override val probabilidadAccidente: Int=10,
    override var tiempo: Int=0

) : Piloto {

    override fun inicializarPiloto(parrilla: Array<Array<Piloto?>>) {
        parrilla[6][0]=this
    }


}

