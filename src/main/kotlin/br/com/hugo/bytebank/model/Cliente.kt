package br.com.hugo.bytebank.model

class Cliente(
    var nome: String,
    val cpf: String,
    private val senha: Int
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {

            if (this.senha == senha) {
                return true
            }
            return false
        }

    }
