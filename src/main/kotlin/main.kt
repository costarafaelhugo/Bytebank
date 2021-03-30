fun main() {
    println("Bem vindo ao Bytebank!")


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

class Conta(
    var titular: String,
    val numero: Int
) {


    var saldo = 1.0
        private set


//    constructor(titular: String, numero:Int){
//         this.titular = titular
//            this.numero=numero
//    }


    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
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

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numerox $numeroX")
    println("numeroy $numeroY")

    val contaJoao = Conta("João", 1002)
    var contaMaria = Conta("Maria", 1003)

    println("Titular conta João: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")
}


fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Hugo Costa $i"

        val numeroConta: Int = 1000 + i

        var saldo = i + 10.0



        println("Titular: $titular ")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo ")
        println("---------------------------")
        i++
    }
//    for (i in 5 downTo 1) {
//
//        if(i==4){
//           continue
//        }
//
//        val titular: String = "Hugo Costa $i"
//
//        val numeroConta: Int = 1000 +i
//
//        var saldo= i +10.0
//
//
//
//        println("Titular: $titular ")
//        println("Numero da conta: $numeroConta")
//        println("Saldo da conta: $saldo ")
//        println("---------------------------")
//    }

//    testaCondicoes(saldo)


    fun testaCondicoes(saldo: Double) {

        //Versão com if/else
//        if (saldo > 0.0) {
//            println("Conta é positiva")
//        } else if (saldo == 0.0) {
//            println("COnta é neutra")
//        } else {
//            println("Conta é negativa")
//        }

        //Versão com when
        when {
            saldo > 0.0 -> println("Conta é positiva")
            saldo == 0.0 -> println("Conta é neutra")
            else -> println("Conta é negativa")
        }
    }
}

