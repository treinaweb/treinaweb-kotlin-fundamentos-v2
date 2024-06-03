package strings

fun main() {
    val firstName = "Cleyson"
    val lastName = "Lima"
    val fullName = "$firstName $lastName"
    println(fullName)

    val num1 = readln().toDouble()
    val num2 = readln().toDouble()

    println("A soma de $num1 e $num2 é: ${num1 + num2}")
}