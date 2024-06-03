package strings

fun main() {
    /*
    Uma string
    com multiplas
    linhas
     */

    val name = "Cleyson"

    val message = """
        *Uma string
        *  com multiplas \n
        *linhas $name
    """.trimMargin("*")
    println(message)
}