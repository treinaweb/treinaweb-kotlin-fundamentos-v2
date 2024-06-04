package collections

fun main() {
    val l1 = listOf("A", "B", "C")

    println(l1)
    println(l1[0])

    for (i in l1) {
        println(i)
    }

    val ml1 = mutableListOf("A", "B", "C")
    println(ml1)
    println(ml1[0])
    for (i in ml1) {
        println(i)
    }

    println()

    println(ml1)
    ml1.add("D")
    println(ml1)

    ml1.add(1, "E")
    println(ml1)

    ml1.removeAt(1)
    println(ml1)

    ml1[1] = "E"
    println(ml1)
}