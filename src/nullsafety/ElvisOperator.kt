package nullsafety

fun main() {
    val name: String? = "Cleyson Lima"
    // val length = if (name != null) name.length else 0
    val length = name?.length ?: 0
    println(length)
}