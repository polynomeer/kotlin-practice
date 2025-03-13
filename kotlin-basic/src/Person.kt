data class Person(val name: String, var age: Int, var isMarried: Boolean)

class Rectangle(val width: Int, val height: Int) {
    val isSquare: Boolean
        get() = width == height
}

fun main() {
    val people = listOf(
        Person("Alice", 29, true),
        Person("Cameron", 42, true),
        Person("Cameron2", 42, true),
        Person("Spielberg", 52, false),
        Person("Spielberg2", 52, false),
        Person("Philip", 12, true),
        Person("Philip2", 12, true)

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

    println(
        people.filter { it.age > 36 }
            .map { "${it.name} 나이는 ${it.age}" }
    )
    println(
        people.filter { it.age > 36 }
            .map { MyChild.ofDefaultAge(it.name, "No Family name") }
            .any { it.age < 30 }
    )
    println(
        people.filter { it.age > 36 }
            .map { MyChild.ofDefaultAge(it.name, "No Family name") }
            .find { it.subName == "Cameron" }
    )

    println(
        people.groupBy { it.age }
    )

    println(
        people.map { it.name }
            .map { it.toList() }
            .flatten()
    )
    println(
        people.map { it.name }
            .flatMap { it.toList() }
    )

    println(
        people.asSequence()
            .map { it.name }
            .find { it.startsWith("J") })


    val person = Person("Dmitry", 30, false)

    println(person.name)
    println(person.age)
    println(person.isMarried)

    val rectangle = Rectangle(width = 5, height = 5)
    println(rectangle.isSquare)
}
