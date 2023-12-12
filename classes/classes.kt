class Customer

class Contact(val id: Int, var email: String)
    
fun main() {
        
    //val customer = Customer()

    val contact = Contact(1, "victor@gmail.com")

    println(contact.id)
    println(contact.email)
    contact.email = "gabriel@gmail.com"
    println(contact.email)
}

// kotlin não necessita necessariamente de um construtor