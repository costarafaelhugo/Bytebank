fun main() {
    println("Bem vindo ao Bytebank!")
    for (i in 5 downTo 1) {

        if(i==4){
           continue
        }

        val titular: String = "Hugo Costa $i"

        val numeroConta: Int = 1000 +i

        var saldo= i +10.0



        println("Titular: $titular ")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo ")
        println("---------------------------")
    }

//    testaCondicoes(saldo)
}


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

