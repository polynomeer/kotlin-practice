import Color.*

enum class Color {
    RED, ORANGE, YELLOW, GREEN
}

fun main() {
    println(getKoreanColorName(RED))
}

fun getKoreanColorName(color: Color): String = when (color) {
    RED, ORANGE -> "빨강 or 오렌지"
    YELLOW -> "노랑"
    GREEN -> "초록"
}

