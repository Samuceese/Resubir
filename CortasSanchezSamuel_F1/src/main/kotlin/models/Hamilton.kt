import models.Piloto

class Hamilton(
    override val nombre: String="Hamilton",
    override val probabilidadAccidente: Int=10
) : Piloto {

    override fun inicializarPiloto(parrilla: Array<Array<Piloto?>>) {
        parrilla[4][0]=this
    }


}

