import br.com.hugo.bytebank.model.Cliente
import br.com.hugo.bytebank.model.ContaCorrente
import br.com.hugo.bytebank.model.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numerox $numeroX")
    println("numeroy $numeroY")

    val joao = Cliente(nome="João", cpf="",senha=1)

    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular.nome="João"


    var contaMaria = ContaPoupanca(Cliente(
        nome = "Maria",
        cpf = "",
        senha = 2
    ),1003)
contaMaria.titular.nome="Maria"
    contaJoao.titular.nome="João"
    println("Titular conta João: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")
}