fun main(args: Array<String>) {
    var maybeNumber: Int? = 15
    maybeNumber = null
   // println(maybeNumber * 2)
    var s1 = "Hello"
    var s2: String? = "world"
    println(s1.length)
    //println(s2.length)
    fun main(args: Array<String>) {
//Null safety
//The !! operator
        var maybeNumber: Int? = 15
        println(maybeNumber!! * 2)
        maybeNumber = null
        println(maybeNumber!! * 2)
    }
}