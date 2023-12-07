fun main() {
    
    var neverNull: String = "This cant be null"

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull: String? = "The compiler assumes non-null"
    inferredNonNull = null

    fun strLength(notNull: String?): Int {
        // return notNull.length
        return notNull?.length ?: 0
    }
    // o strLength espera algo e não um nulo

    strLength(neverNull)
    strLength(nullable) // strLength não lê nulo

}