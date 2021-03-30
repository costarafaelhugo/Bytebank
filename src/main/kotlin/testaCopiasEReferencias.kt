fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numerox $numeroX")
    println("numeroy $numeroY")

    val contaJoao = Conta("João", 1002)
    var contaMaria = Conta("Maria", 1003)

    println("Titular conta João: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")
}