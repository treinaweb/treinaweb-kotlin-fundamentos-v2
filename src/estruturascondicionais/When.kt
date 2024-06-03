package estruturascondicionais

fun main() {
    val month = 1

    val name = when (month) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        else -> "Mês invalido"
    }

    println(name)
}