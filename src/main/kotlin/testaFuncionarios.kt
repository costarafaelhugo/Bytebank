
fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-09",
        salario = 1000.0,

        )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "333.333.331-02",
        salario = 2000.0,
        senha = 1234
    )

    println("__________________")
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "111.111.111-08",
        salario = 1000.0,
        senha = 4000,
        plr = 2000.0
    )

    println("__________________")
    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")

    if (fran.autentica(4000)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-54",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.resgistra(alex)
    calculadora.resgistra(fran)
    calculadora.resgistra(gui)
    calculadora.resgistra(maria)

    println("Total de bonificação: ${calculadora.total}")
}