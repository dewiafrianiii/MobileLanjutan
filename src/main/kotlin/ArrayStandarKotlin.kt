fun main(args: Array<String>) {
    val asc = Array(5){
        i ->(i * i).toString()
    }
    asc.forEach{println(it)}
}