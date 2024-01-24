import models.Piloto

class LeClerc(
    override val nombre: String="LeClerc",
    override val probabilidadAccidente: Int=20,
    override var tiempo: Int=0

) : Piloto {

    override fun inicializarPiloto(parrilla: Array<Array<Piloto?>>) {
        parrilla[7][0]=this
    }


}

