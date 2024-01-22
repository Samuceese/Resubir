import models.Piloto

class Verstappen(
    override val nombre: String="Max Verstappen",
    override val probabilidadAccidente: Int=5
) : Piloto {

    override fun inicializarPiloto(parrilla: Array<Array<Piloto?>>) {
        parrilla[0][0]=this
    }


}

