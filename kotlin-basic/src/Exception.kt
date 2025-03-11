import java.io.IOException

fun main() {
    function1()
    function2()
}

@Throws(IOException::class)
fun function1() {
    try {
        Integer.parseInt("123")
//        throw IOException("Checked Exception Occurred!")
    } catch (e: Exception) {
        throw IOException("Checked Exception")
    } finally {
        println("무조건 실행")
    }
}

fun function2() {
    try {
        Integer.parseInt("123")
//        throw IOException("Checked Exception Occurred!")
    } catch (e: IOException) {
        throw RuntimeException("Unchecked Exception")
    } finally {
        println("무조건 실행")
    }
}
