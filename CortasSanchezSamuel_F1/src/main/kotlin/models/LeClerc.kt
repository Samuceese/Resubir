import models.Piloto

class LeClerc(
    override val nombre: String="LeClerc",
    override val probabilidadAccidente: Int=20
) : Piloto {

    override fun inicializarPiloto(parrilla: Array<Array<Piloto?>>) {
        parrilla[7][0]=this
    }


}

