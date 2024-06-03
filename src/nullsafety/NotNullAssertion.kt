package nullsafety

fun main() {
    val name: String? = "Cleyson Lima"
    val reversed = name!!.reversed()

    println(reversed)
}