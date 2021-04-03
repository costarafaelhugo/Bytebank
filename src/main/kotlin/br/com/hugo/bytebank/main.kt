import br.com.hugo.bytebank.model.Endereco
import java.lang.ClassCastException
import java.lang.NumberFormatException

fun main() {
    println("inicio main")
    val entrada: String = "1.0"

    var valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }


    if (valorComTaxa != null) {
        println("Valor recebido: $valorRecebido")
    } else {
        println("valor inválido")
    }
    funcao1()
    println("fim main")
}

fun funcao1() {
    println("inicio funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("inicio funcao2")
    try {
        for (i in 1..5) {
            println(i)
            val endereco = Any()

            endereco as Endereco

        }

    } catch (e: ClassCastException) {
        e.printStackTrace()
        println("ClassCastException foi pegado")
    }
    println("fim funcao2")
}










