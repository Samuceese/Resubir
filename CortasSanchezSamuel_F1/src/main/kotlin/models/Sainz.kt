import models.Piloto

class Sainz(
    override val nombre: String="Sainz",
    override val probabilidadAccidente: Int=10
) : Piloto {

    override fun inicializarPiloto(parrilla: Array<Array<Piloto?>>) {
        parrilla[6][0]=this
    }


}

