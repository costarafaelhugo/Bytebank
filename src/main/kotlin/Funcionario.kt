class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val tipo:Int// 0 funcionário comun, 1 gerente, 2 diretor
) {
    fun bonificacao(): Double {
        when (tipo) {
            0 -> {
                return salario * 0.1
            }
            1 -> {
                return salario * 0.2
            }
            else -> {
                return salario * 0.3
            }
        }
    }
    fun autentica(senha: Int){
        if(tipo==1){

        }
    }
}