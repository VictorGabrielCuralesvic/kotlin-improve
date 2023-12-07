fun someCodition() = false

fun main() {
    
    val d: Int

    if (someCodition()) {
        d = 1
    } else {
        d = 2
    }

    println(d)
}