fun main() {
    println("Bem vindo ao Bytebank!")

    val titular: String = "Hugo Costa"

    val numeroConta: Int = 1000

    var saldo: Double = 100 + 2.0

    saldo += 200
    saldo = 0.0



    println("Titular: $titular ")
    println("Numero da conta: $numeroConta")
    println("Saldo da conta: $saldo ")

    when {
        saldo > 0.0 -> {
            println("Conta é positiva")
        }
        saldo ==0.0 -> {
            println("Conta é neutra")
        }
        else -> {
            println("Conta é negativa")
        }
    }
}