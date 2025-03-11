/*class User constructor(_username: String) {
    val username: String

    init {
        this.username = _username
    }
}*/

/*class User constructor(_username: String) {
    val username: String = _username
}*/

class User(
    val username: String,
    val level: Int = 1
)

fun main() {
    println(User("Benny").username)
    println(User(username = "Noone", level = 3).level)
}
