package br.com.hugo.bytebank.teste

import br.com.hugo.bytebank.exceptions.SaldoInsuficienteException

class testaPilha {
    fun funcao1() {
        println("inicio funcao1")
        try {
            funcao2()

        }catch (e: SaldoInsuficienteException){
            println("SaldoInsuficienteException foi pego")
        }

        println("fim funcao1")
    }

    fun funcao2() {
        println("inicio funcao2")

        for (i in 1..5) {
            println(i)
            throw  SaldoInsuficienteException()
        }
        println("fim funcao2")
    }

}