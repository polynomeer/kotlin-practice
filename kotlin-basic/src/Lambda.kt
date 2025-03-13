fun sumFunction(x: Int, y: Int): Int {
    return x + y
}

val sumLambda = { x: Int, y: Int -> x + y }

fun main() {
    println(sumFunction(12, 34))
    println(sumLambda(12, 34))
    println({ x: Int, y: Int -> x + y }(12, 34))
}
