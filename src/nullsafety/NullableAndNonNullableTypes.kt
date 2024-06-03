package nullsafety

fun main() {
    var a: Int? = 10
    a = 20
    a = 25
    a = null

    println(a)
}