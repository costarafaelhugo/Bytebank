open class Conta(
    var titular: String,
    val numero: Int
) {


    var saldo = 1.0
        private set

   fun deposita(valor: Double) {
        this.saldo += valor
    }

    open fun saca(valor: Double) {
        if (valor > 0) {
            if (saldo >= valor)
                saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }


}