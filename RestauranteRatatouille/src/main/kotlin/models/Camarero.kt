package models

data class Camarero(
    val id: Int,
    val mesaAsignada:Int,
    var estado: EstadoCamarero
)

enum class EstadoCamarero {
    ESPERANDO, ATENDIENDO, EN_CAMINO, RECOGIENDO

}
