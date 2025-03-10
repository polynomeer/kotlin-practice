val i: Int = 123
val j = 321
var age = 26

fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun main() {
    println("1 + 2 = ${sum1(a = 1, b = 2)}")
    println("1 + 2 = ${sum2(a = 1, b = 2)}")

    println("i is $i")
    println("j is $j")
    age = 25
    println("age is $age")
    println("age is ${sum1(age, 3)}")
}
