fun main() {
    val students = mutableMapOf<Int, String>()

    students[1] = "Jack"
    students[2] = "John"
    students[3] = "Peter"

    for (student in students) {
        println(student)
        println("번호: ${student.key}, 이름: ${student.value}")
    }
    println()

    val st = mapOf(
        1 to "Jack",
        2 to "Diana",
        3 to "Frost"
    )

    for ((num, name) in st) {
        println("번호: $num, 이름: $name")
    }
    println()

    println("a는 ${recognize('a')}")
    println("3는 ${recognize('3')}")
    println("[는 ${recognize('[')}")
}

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "숫자"
    in 'a'..'z', in 'A'..'Z' -> "알파벳"
    else -> "숫자도 문자도 아님"
}
