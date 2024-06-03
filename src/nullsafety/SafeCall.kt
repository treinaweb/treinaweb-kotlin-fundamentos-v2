package nullsafety

fun main() {
    var name: String? = "Cleyson Lima"
    var length = name?.length
    println(length)

    name = null
    length = name?.length
    println(length)
}