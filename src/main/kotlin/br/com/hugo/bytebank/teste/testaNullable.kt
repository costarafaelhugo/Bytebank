package br.com.hugo.bytebank.teste

import br.com.hugo.bytebank.model.Endereco
import java.lang.IllegalStateException

fun testaNullable() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "pŕedio")
    val lograddouroNovo: String? = enderecoNulo?.logradouro
    val let = enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhaComprlemento: Int = it.complemento?.length ?: throw IllegalStateException("complemento deve existir")
        println(tamanhaComprlemento)
    }

}