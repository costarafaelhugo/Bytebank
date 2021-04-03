package br.com.hugo.bytebank.exceptions

class FalhaAutenticacaoException (
    mensagem:String = "Falha na autenticação"
        ): Exception(mensagem)