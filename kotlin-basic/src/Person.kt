class Person(val name: String, var age: Int, var isMarried: Boolean)

class Rectangle(val width: Int, val height: Int) {
    val isSquare: Boolean
        get() = width == height
}

fun main() {
    val person = Person("Dmitry", 30, false)

    println(person.name)
    println(person.age)
    println(person.isMarried)

    val rectangle = Rectangle(width = 5, height = 5)
    println(rectangle.isSquare)
}
