data class Person(val name: String, var age: Int, var isMarried: Boolean)

class Rectangle(val width: Int, val height: Int) {
    val isSquare: Boolean
        get() = width == height
}

fun main() {
    val people = listOf(
        Person("Alice", 29, true),
        Person("Cameron", 42, true),
        Person("Spielberg", 52, false),
        Person("Philip", 12, true)
    )

    println(
        people.maxByOrNull({ person: Person -> person.age })
    )
    println(
        people.maxByOrNull { person: Person -> person.age }
    )
    println(
        people.maxByOrNull { person -> person.age }
    )
    println(
        people.maxByOrNull { it.age }
    )
    println(
        people.maxByOrNull(Person::age)
    )

    val person = Person("Dmitry", 30, false)

    println(person.name)
    println(person.age)
    println(person.isMarried)

    val rectangle = Rectangle(width = 5, height = 5)
    println(rectangle.isSquare)
}
