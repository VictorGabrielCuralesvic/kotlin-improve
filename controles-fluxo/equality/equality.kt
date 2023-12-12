
fun main() {
    
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) /* pouca certeza */
    println(authors === writers) /* mais certeza */

}