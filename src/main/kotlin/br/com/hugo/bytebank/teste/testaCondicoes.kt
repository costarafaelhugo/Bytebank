fun testaCondicoes(saldo: Double) {

    //Versão com if/else
//        if (saldo > 0.0) {
//            println("br.com.hugo.bytebank.model.Conta é positiva")
//        } else if (saldo == 0.0) {
//            println("COnta é neutra")
//        } else {
//            println("br.com.hugo.bytebank.model.Conta é negativa")
//        }

    //Versão com when
    when {
        saldo > 0.0 -> println("br.com.hugo.bytebank.model.Conta é positiva")
        saldo == 0.0 -> println("br.com.hugo.bytebank.model.Conta é neutra")
        else -> println("br.com.hugo.bytebank.model.Conta é negativa")
    }
}