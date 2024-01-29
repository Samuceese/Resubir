package controllers

class DanZum {

    fun ingresarCantidad(saldo: Double, cantidadIngresar: Double) {
        println("Introduce la cantidad a ingresar:")
        val cantidadIngresar = readLine()?.toDoubleOrNull() ?: 0.0
        if (esCantidadValida(cantidadIngresar)) {
            val nuevoSaldo = saldo + cantidadIngresar
            println("Se ha ingresado $cantidadIngresar a la cuenta.")
            println("Nuevo saldo: $nuevoSaldo")
        } else {
            println("La cantidad ingresada no es válida.")
        }
    }

    fun retirarCantidad(saldo: Double, cantidadRetirar: Double) {
        println("Introduce la cantidad a retirar:")
        val cantidadRetirar = readln()?.toDoubleOrNull() ?: 0.0
        if (esCantidadValida(cantidadRetirar)) {
            if (saldo >= cantidadRetirar) {
                val nuevoSaldo = saldo - cantidadRetirar
                println("Se ha retirado $cantidadRetirar de la cuenta.")
                println("Nuevo saldo: $nuevoSaldo")
            } else {
                println("Saldo insuficiente para realizar la retirada.")
            }
        } else {
            println("La cantidad ingresada no es válida.")
        }
    }

    fun transferencia(saldo: Double, cantidad: Double, telefono: Int) {
        if (saldo >= cantidad) {
            val nuevoSaldo = saldo - cantidad
            println("Se ha transferido $cantidad al teléfono $telefono.")
            println("Nuevo saldo: $nuevoSaldo")
        } else {
            println("Saldo insuficiente para realizar la transferencia.")
        }
    }

    fun realizarTransferencia(saldo: Double, cantidadTransferir: Double) {
        println("Introduce el teléfono del usuario a ingresar")
        val telefono = readln()?.toIntOrNull() ?: 0
        if (!esTelefonoValido(telefono)) {
            return
        }

        println("Introduce la cantidad a transferir:")
        val cantidadTransferir = readln()?.toDoubleOrNull() ?: 0.0
        transferencia(saldo, cantidadTransferir, telefono)
    }

    fun esNombreDeUsuarioValido(username: String): Boolean {
        val inputRegex = "^[a-zA-Z0-9]{3,15}$".toRegex()
        if (!inputRegex.matches(username)) {
            println("El nombre de usuario no es válido")
            return false
        }
        return true
    }

    fun esTelefonoValido(telefono: Int): Boolean {
        val inputRegex = "^\\d{9}$".toRegex()
        val telefonoString = telefono.toString()
        if (!inputRegex.matches(telefonoString)) {
            println("El teléfono de usuario no es válido")
            return false
        }
        return true
    }

    fun esSaldoNoNegativo(saldo: Double): Boolean {
        if (saldo<0){
            println("El saldo no puede ser negativo")
            return false
        }
        return true
    }

    fun esCantidadValida(cantidad: Double): Boolean {
        if (cantidad <= 0) {
            println("La cantidad a ingresar debe ser un número positivo.")
            return false
        }
        return true
    }
}