package exceptions

fun main() {
    print("> ")
    val a = readln().toInt()

    print("> ")
    val b = readln().toInt()

    try {
        val result = divide(a, b)
        println("Resultado: $result")
    } catch (e: ArithmeticException) {
        println(e.message)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}

private fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        throw IllegalArgumentException("Não é possivel realizar uma divisão por 0")
    }

    return a / b
}