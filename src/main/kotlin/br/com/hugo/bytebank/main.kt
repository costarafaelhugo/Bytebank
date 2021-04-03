import br.com.hugo.bytebank.model.Endereco
import java.lang.ClassCastException

fun main() {
    println("inicio main")
//    try {
//        10 / 0
//    } catch (e: ArithmeticException) {
//        println("ArithmeticException foi pegada")
//    }
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

    }catch (e:ClassCastException){
        e.printStackTrace()
        println("ClassCastException foi pegado")
    }
    println("fim funcao2")
}










