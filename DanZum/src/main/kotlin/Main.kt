import controllers.DanZum

fun main() {
    val danZum = DanZum()

    var esValidoUsername: Boolean
    var esValidoTelefono: Boolean

    do {
        println("Introduce tu username (Alfanumérico entre 3 y 15 caracteres)")
        val username = readln()
        esValidoUsername = danZum.esNombreDeUsuarioValido(username)

        println("Introduce tu teléfono (Número de 9 caracteres)")
        val telefono = readln()?.toIntOrNull() ?: 0
        esValidoTelefono = danZum.esTelefonoValido(telefono)

    } while (!esValidoUsername || !esValidoTelefono)

    var saldo: Double
    do {
        println("Introduce tu saldo:")
        saldo = readln()?.toDoubleOrNull() ?: 0.0
    } while (!danZum.esSaldoNoNegativo(saldo))

    var opcion: Int
    do {
        println("¿Qué acción quieres realizar?")
        println("1. Ingresar cantidad a cuenta")
        println("2. Retirar cantidad de cuenta")
        println("3. Realizar transferencia")
        println("4. Salir")

        opcion = readln()?.toIntOrNull() ?: -1

        when (opcion) {
            1 -> {
                println("Introduce la cantidad a ingresar:")
                val cantidadIngresar = readln()?.toDoubleOrNull() ?: 0.0
                danZum.ingresarCantidad(saldo, cantidadIngresar)
            }
            2 -> {
                println("Introduce la cantidad a retirar:")
                val cantidadRetirar = readln()?.toDoubleOrNull() ?: 0.0
                danZum.retirarCantidad(saldo, cantidadRetirar)
            }
            3 -> {
                println("Introduce la cantidad a transferir:")
                val cantidadTransferir = readln()?.toDoubleOrNull() ?: 0.0
                danZum.realizarTransferencia(saldo, cantidadTransferir)
            }
        }
    } while (opcion != 4)
}
