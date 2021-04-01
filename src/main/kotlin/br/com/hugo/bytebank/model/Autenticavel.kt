package br.com.hugo.bytebank.model

interface Autenticavel {

    fun autentica (senha: Int) : Boolean

}