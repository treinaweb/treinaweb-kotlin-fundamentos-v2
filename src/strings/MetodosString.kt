package strings

fun main() {
    val name = "Cleyson Lima"

    println(name.reversed())
    println(name.lowercase())
    println(name.uppercase())
    println(name.equals("Cleyson Lima")) // prefira name == "Cleyson Lima"
    println(name.slice(0..2))
    println(name.length)
    println(name.get(10)) // prefira name[10]
    println(name.startsWith("Cle"))
    println(name.endsWith("lima"))
}