object NumberUtils {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}

data class MyChild(val subName: String, val familyName: String, val age: Int) {
    companion object {
        const val MAX_CHILDREN_COUNT = 4
        fun ofDefaultAge(
            subName: String,
            familyName: String
        ): MyChild = MyChild(subName, familyName, 0)
    }
}

fun main() {
    println(NumberUtils.sum(4, 2))
    println(NumberUtils.multiply(4, 3))
    println(MyChild.ofDefaultAge("Snow", "John"))
}
