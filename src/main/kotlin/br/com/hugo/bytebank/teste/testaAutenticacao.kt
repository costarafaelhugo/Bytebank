import br.com.hugo.bytebank.model.Cliente
import br.com.hugo.bytebank.model.Diretor
import br.com.hugo.bytebank.model.Gerente
import br.com.hugo.bytebank.model.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )

    val diretor = Diretor(
        nome = "Fran",
        cpf = "111.145.111-11",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0

    )

    val cliente= Cliente(
        nome = "Gui",
        cpf="333.333.333-33",
        senha=1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, senha = 1000)
    sistema.entra(diretor, senha = 2000)
    sistema.entra(cliente, senha = 1234)



}