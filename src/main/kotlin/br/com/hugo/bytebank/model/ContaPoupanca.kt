package br.com.hugo.bytebank.model

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
){
    override fun saca(valor: Double) {
        if (this.saldo>=valor){
            this.saldo-=valor
        }
    }
}