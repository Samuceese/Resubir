import models.Piloto

class Russel(
    override val nombre: String="Russel",
    override val probabilidadAccidente: Int=15
) : Piloto {

    override fun inicializarPiloto(parrilla: Array<Array<Piloto?>>) {
        parrilla[5][0]=this
    }


}

