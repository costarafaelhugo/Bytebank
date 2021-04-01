package br.com.hugo.bytebank.model

class CalculadoraBonificacao {

    var total:Double = 0.0
        private set

    fun resgistra(funcionario: Funcionario){
        println("nome ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

//    fun resgistra(gerente: br.com.hugo.bytebank.model.Gerente){
//        this.total += gerente.bonificacao
//    }
//    fun resgistra(diretor: br.com.hugo.bytebank.model.Diretor){
//        this.total += diretor.bonificacao
//    }
}