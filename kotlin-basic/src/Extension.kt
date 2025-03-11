fun String.double() = this + this

infix fun String.add(postfix: String) = this + postfix

fun main() {
    println("abc".double())
    println(setOf(1, 3, 4, 522, 324, 4).maxOrNull())
    println("My name is " add "Snow")
    println(
        mapOf(
            "key1" to "value1",
            "key2" to "value2"
        )
    )

    val (firstName, lastName) = Pair("Snow", "Man")

    mapOf(
        "key1" to "value1",
        "key2" to "value2"
    ).forEach { (key, value) ->
        println("${key} : ${value}")
    }
}
