fun main() {
    println("Bem vindo ao Bytebank!")

    val contaHugo = Conta()
    contaHugo.tiular = "Hugo"
    contaHugo.numero = 1000
    contaHugo.saldo = 200.0


    val contaFran = Conta()
    contaFran.tiular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    println(contaHugo.tiular)
    println(contaHugo.numero)
    println(contaHugo.saldo)

    println(contaFran.tiular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Hugo.")
    deposita(contaHugo, 50.0)
    println(contaHugo.saldo)

    println("Depositando na conta da Fran.")
    deposita(contaFran, 70.0)
    println(contaFran.saldo)
}

fun deposita(conta: Conta, valor:Double){
    conta.saldo += valor
}

class Conta {
    var tiular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numerox $numeroX")
    println("numeroy $numeroY")

    val contaJoao = Conta()
    contaJoao.tiular = "João"
    var contaMaria = Conta()
    contaMaria.tiular = "Maria"

    println("Titular conta João: ${contaJoao.tiular}")
    println("Titular conta Maria: ${contaMaria.tiular}")
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

