class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val plr: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

    override val bonificacao: Double
        get() {
            return salario + plr
        }

}
