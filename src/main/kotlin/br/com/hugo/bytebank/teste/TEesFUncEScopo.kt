package br.com.hugo.bytebank.teste

import br.com.hugo.bytebank.model.Endereco

fun testaFuncoesEscopo() {
    //    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .run {
            "${logradouro}, ${numero}".toUpperCase()
        }.let(::println)

    val enderecoComComplemento = listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter { endereco -> endereco.complemento!!.isNotEmpty() }
    println(enderecoComComplemento)
}