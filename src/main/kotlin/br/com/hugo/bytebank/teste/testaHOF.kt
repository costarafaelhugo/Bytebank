package br.com.hugo.bytebank.teste

import br.com.hugo.bytebank.model.Autenticavel
import br.com.hugo.bytebank.model.SistemaInterno

fun testaHOF() {
    soma(5, 5) {
        val it = null
        println(it)
    }

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })

    fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
        println("Antes da soma")
        resultado(a + b)
        println("Depois da soma")

    }
}