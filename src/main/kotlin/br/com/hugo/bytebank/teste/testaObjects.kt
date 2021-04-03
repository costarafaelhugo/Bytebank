package br.com.hugo.bytebank.teste

import br.com.hugo.bytebank.model.Cliente
import br.com.hugo.bytebank.model.Conta
import br.com.hugo.bytebank.model.ContaPoupanca


fun testaObjecs() {
    val fran = object {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-89"
        val senha: Int = 100

        fun autentica(senha: Int) = this.senha == senha
    }


    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaPoupanca(titular = alex, numero = 1001)

    println("Total de contas: ${Conta.total}")
}