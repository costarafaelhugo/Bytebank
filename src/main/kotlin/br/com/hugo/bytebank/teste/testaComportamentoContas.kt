import br.com.hugo.bytebank.exceptions.FalhaAutenticacaoException
import br.com.hugo.bytebank.exceptions.SaldoInsuficienteException
import br.com.hugo.bytebank.model.Cliente
import br.com.hugo.bytebank.model.ContaCorrente
import br.com.hugo.bytebank.model.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaHugo = ContaCorrente(alex, 1000)
    contaHugo.deposita(200.00)


    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)
    val contaFran = ContaPoupanca(fran, 1001)
    contaFran.deposita(300.0)

    println(contaHugo.titular)
    println(contaHugo.numero)
    println(contaHugo.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Hugo.")
    contaHugo.deposita(50.0)
    println(contaHugo.saldo)

    println("Depositando na conta da Fran.")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando na conta do Hugo")
    contaHugo.saca(250.0)
    println(contaHugo.saldo)

    println("Sacando na conta do Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Saque me excesso na conta do Hugo")
    contaHugo.saca(100.0)
    println(contaHugo.saldo)

    println("Saque me excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para a conta do Hugo.")
try {
    contaFran.transfere(destino = contaHugo, valor = 250.0,senha = 2)
    println("Transferência sucedida")
}
catch (e:SaldoInsuficienteException) {
    println("Falha na transferência")
    println("Saldo insuficiente")
    e.printStackTrace()
}catch (e:FalhaAutenticacaoException){
    println("Falha na transferência")
    println("Falha na autenticação")
    e.printStackTrace()
}catch (e: Exception){
    println("Erro desconhecido")
    e.printStackTrace()
}
    println(contaHugo.saldo)
    println(contaFran.saldo)
}