import br.com.hugo.bytebank.model.Endereco
import java.lang.IllegalStateException
import kotlin.math.log

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "pŕedio")
    val lograddouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhaComprlemento: Int = it.complemento?.length ?: throw IllegalStateException("complemento deve existir")
        println(tamanhaComprlemento)
    }
}













