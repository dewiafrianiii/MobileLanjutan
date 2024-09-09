fun main(args: Array<String>) {
    var maybeNumber : Int? = 15
    maybeNumber = null
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}