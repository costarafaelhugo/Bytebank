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
}

class Conta {
    var tiular = ""
    var numero = 0
    var saldo = 0.0
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

