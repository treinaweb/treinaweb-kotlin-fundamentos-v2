package funcoes

fun main() {
    greeting("Cleyson")
    sum(10.5, 3.1)

    val a = sum2(11.5, 7.2)
    println(a)

    val b = divide(b = 10.0, a = 3.0)
    println(b)

    sum(10.0)
}

private fun greeting(name: String = "TreinaWeb") {
    println("Olá $name")
}

private fun sum(a: Double, b: Double = 0.0) {
    println(a + b)
}

private fun sum2(a: Double, b: Double): Double {
    return a + b
}

private fun divide(a: Double, b: Double): Double {
    return a / b
}