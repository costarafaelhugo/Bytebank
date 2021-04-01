package model

import model.Funcionario

class CalculadoraBonificacao {

    var total:Double = 0.0
        private set

    fun resgistra(funcionario: Funcionario){
        println("nome ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

//    fun resgistra(gerente: model.Gerente){
//        this.total += gerente.bonificacao
//    }
//    fun resgistra(diretor: model.Diretor){
//        this.total += diretor.bonificacao
//    }
}