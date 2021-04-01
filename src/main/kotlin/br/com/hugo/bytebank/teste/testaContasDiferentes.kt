import br.com.hugo.bytebank.model.Cliente
import br.com.hugo.bytebank.model.ContaCorrente
import br.com.hugo.bytebank.model.ContaPoupanca
import br.com.hugo.bytebank.model.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            cpf = "000.111.222-8",
            senha = 1,
            endereco = Endereco(
                logradouro = "Rua Vergueiro"
            )
        ),
        1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome="Fran", cpf="456.454.454-98", senha=2),
        1001
    )


    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("titular ${contaCorrente.titular}")
    println("nome do titular  ${contaCorrente.titular.nome}")
    println("cpf do titular  ${contaCorrente.titular.cpf}")
    println("endereço do titular ${contaCorrente.titular.endereco.logradouro}")

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