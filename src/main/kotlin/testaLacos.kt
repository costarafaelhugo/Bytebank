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
}