package funcoes

fun main() {
    val a = sum(1.5, 3.1, 7.2, 5.7)
    println(a)
}

private fun sum(vararg values: Double): Double {
    var acc = 0.0
    for (value in values) {
        acc += value
    }
    return acc
}