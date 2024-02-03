class User(val id: Int, val name: String)

/* 
 * No Kotlin, a declaração de um objeto (por meio da palavra-chave object) 
 * é uma maneira concisa e eficaz de implementar o padrão Singleton.
 */
object UserManager {

  private val users = mutableListOf<User>()
  private var InitialUserId = 1

  fun addUser(name: String) {
    val newUser = User(InitialUserId++, name)
    users.add(newUser)
  }

  fun listUsers() {
    users.forEach { println("${it.id} - ${it.name}") }
  }
}

fun main() {
  val quantity = readLine()?.toIntOrNull() ?: 0

  for (i in 1..quantity) {
    val name = readLine() ?: ""
    UserManager.addUser(name)
  }

  UserManager.listUsers()
}