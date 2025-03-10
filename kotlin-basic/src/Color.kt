import Color.*
import java.time.Duration
import java.time.LocalDateTime

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE
}

fun main() {
    println(getKoreanColorName(RED))
    printObject("OBJECT")
    printObject(java.time.Duration.ofNanos(3456))
    printObject(java.time.LocalDateTime.of(2023, 12, 12, 10, 10))
}

fun getKoreanColorName(color: Color): String = when (color) {
    RED, ORANGE -> "빨강 or 오렌지"
    YELLOW -> "노랑"
    GREEN -> "초록"
    BLUE -> "파랑"
}

fun mix(c1: Color, c2: Color) = when {
    c1 == RED && c2 == YELLOW -> "오렌지"
    c1 == YELLOW && c2 == BLUE -> "녹색"
    else -> throw RuntimeException("cannot mix $c1 and $c2")
}

fun trueOrFalse(b: Boolean) = when (isBeautiful(b)) {
    true -> true
    false -> false
}

fun isBeautiful(b: Boolean) = true

fun printObject(obj: Any): Unit = when (obj) {
    is String -> println(obj.lowercase())
    is Duration -> println(obj.nano)
    is LocalDateTime -> println(obj.month)
    else -> println("Unknown type")
}

fun printObjects(obj: Any): Unit = if (obj is String) {
    println(obj.lowercase())
} else {
    println("Unknown type")
}
