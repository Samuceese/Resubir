import models.Piloto

class Checo(
    override val nombre: String="Checo Pérez",
    override val probabilidadAccidente: Int=10,
    override var tiempo: Int=0
) : Piloto {

    override fun inicializarPiloto(parrilla: Array<Array<Piloto?>>) {
        parrilla[1][0]=this
    }

}

