package br.com.hugo.bytebank.model

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int

) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha=senha
){

    override val bonificacao: Double
        get(){return salario
        }

}
