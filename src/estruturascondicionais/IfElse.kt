package estruturascondicionais

fun main() {
    val age = readln().toInt()

    val message = if (age >= 18) {
        "Você pode tirar a carteira de motorista"
    } else if (age >= 16) {
        "Você não pode tirar a carteira de motorista, mas já pode votar"
    } else {
        "Você não pode tirar a carteira de motorista"
    }

    println(message)
}