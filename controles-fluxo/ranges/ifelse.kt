
fun main() {

    val x = 3

    if (x in 1..5) {
        print("x is in range from 1 to 5")
    } else {
        print("x is not in the range")
    }
    println()

    if (x !in 6..10) {
        print("x is not in range from 6 to 10")
    } else {
        print("alright")
    }
}