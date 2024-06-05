package collections

fun main() {
    val m1 = mapOf("nome" to "Cleyson", "endereco" to "São Paulo")
    println(m1)

    println(m1["nome"])
    println(m1["endereco"])

    val mm1 = mutableMapOf("nome" to "Elton", "endereco" to "São Paulo")
    println(mm1)

    println(mm1["nome"])
    println(mm1["endereco"])

    mm1["nome"] = "Elton Fonseca"
    println(mm1)

    mm1["telefone"] = "(11) 99899-9191"
    println(mm1)

    println()

    for (i in mm1) {
        println("chave=${i.key} e valor=${i.value}")
    }
}