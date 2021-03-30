
fun testaComportamentosConta() {
    val contaHugo = Conta("Hugo", 1000)
    contaHugo.deposita(200.00)


    val contaFran = Conta("Fran", 1001)
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
    if (contaFran.transfere(100.00, contaHugo)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaHugo.saldo)
    println(contaFran.saldo)
}