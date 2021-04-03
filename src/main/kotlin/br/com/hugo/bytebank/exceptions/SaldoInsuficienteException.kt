package br.com.hugo.bytebank.exceptions

class SaldoInsuficienteException (
    mensagem:String = "O Saldo é isncuficiente"): Exception(mensagem)
