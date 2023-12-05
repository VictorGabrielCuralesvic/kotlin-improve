fun printMessage(message: String): Unit {
    println(message)
}

// Unit é que vai retornar qualquer coisa
// pode definir o que vai ser retornado

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("hello")
    printMessageWithPrefix("hello", "log")
    printMessageWithPrefix("hello")
    printMessageWithPrefix(prefix = "log", message = "hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}
