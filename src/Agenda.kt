fun main() {
    var choice = 0
    val contacts = mutableListOf<Map<String, String>>()

    do {
        showMenu()
        choice = getChoice()

        when (choice) {
            1 -> contacts.add(createContact())
            2 -> showContacts(contacts)
            3 -> contacts.removeAt(deleteContact())
            0 -> println("Até mais, e obrigado pelos peixes!")
            else -> println("Opção inválida")
        }
    } while (choice != 0)
}

fun showMenu() {
    println("====== MENU ======")
    println("1. Novo contato")
    println("2. Listar contatos")
    println("3. Remover contato")
    println("0. Sair")
}

fun getChoice(): Int {
    print("> ")
    return readln().toInt()
}

fun createContact(): Map<String, String> {
    print("Nome: ")
    val name = readln()

    print("Email: ")
    val email = readln()

    print("Telefone: ")
    val phone = readln()

    println("Contato cadastrado com sucesso!")

    return mapOf("name" to name, "email" to email, "phone" to phone)
}

fun showContacts(contacts: List<Map<String, String>>) {
    if (contacts.isEmpty()) {
        println("Nenhum contato cadastrado")
    }

    for ((index, contact) in contacts.withIndex()) {
        val name = contact["name"]
        val email = contact["email"]
        val phone = contact["phone"]

        println("$index - $name, $email, $phone")
    }
}

fun deleteContact(): Int {
    println("Qual o índice do contato que deseja remover?")
    print("> ")
    return readln().toInt()
}