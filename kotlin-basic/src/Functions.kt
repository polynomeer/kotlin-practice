fun getMyName(
    firstName: String = "foo",
    lastName: String = "bar",
): String = "$firstName $lastName"

const val ONE = 1
const val TWO = 2

fun sum(num1: Int, num2: Int): Int = num1 + num2

fun main() {
    println(getMyName("Steve", "Jobs"))
    println(getMyName("Jobs", "Steve"))
    println(getMyName(firstName = "Steve", lastName = "Jobs"))
    println(getMyName(lastName = "Steve", firstName = "Jobs"))

    println(getMyName())
    println(getMyName(firstName = "Steve"))
    println(getMyName(lastName = "Jobs"))

    println(sum(1, 2))
}
