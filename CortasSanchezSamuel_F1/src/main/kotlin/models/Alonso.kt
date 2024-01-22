import models.Piloto

class Alonso(
    override val nombre: String="Fernando Alonso",
    override val probabilidadAccidente: Int=5
) : Piloto {

    override fun inicializarPiloto(parrilla: Array<Array<Piloto?>>) {
        parrilla[2][0]=this
    }



}

