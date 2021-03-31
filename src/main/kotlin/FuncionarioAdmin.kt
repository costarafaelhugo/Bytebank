abstract class FuncionarioAdmin(
    val nome: String,
    val cpf: String,
    val salario: Double,

    ) {
    abstract val bonificacao: Double
}