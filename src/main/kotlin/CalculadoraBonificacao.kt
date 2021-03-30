class CalculadoraBonificacao {

    var total:Double = 0.0
        private set

    fun resgistra(funcionario: Funcionario){
        println("nome ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

//    fun resgistra(gerente: Gerente){
//        this.total += gerente.bonificacao
//    }
//    fun resgistra(diretor: Diretor){
//        this.total += diretor.bonificacao
//    }
}