fun main() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())

    val minhaFuncaoClasse:() -> Unit= Teste()
    println(minhaFuncaoClasse())
}

fun teste(){
    println("executa teste")
}


class Teste: () -> Unit{
    override fun invoke() {
        println("Executa invoke do teste")
    }

}














