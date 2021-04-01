import model.ContaCorrente
import model.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        "alex",
        1000
    )

    val contaPoupanca = ContaPoupanca(
        "Fran",
        1001
    )


    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo Poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo corrente pós saque: ${contaCorrente.saldo}")
    println("saldo Poupança pós saque: ${contaPoupanca.saldo}")

    println("saldo poupança: ${contaPoupanca.saldo}")
    println("saldo Corrente: ${contaCorrente.saldo}")
    contaCorrente.transfere(100.0, contaPoupanca)
    println("saldo Corrente pós tranferir: ${contaCorrente.saldo}")

    println("saldo poupança: ${contaPoupanca.saldo}")
}