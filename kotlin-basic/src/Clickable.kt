interface Clickable {
    fun click()
}

class Button : Clickable {
    override fun click() {
        println("Button is clicked")
    }

    private fun internalPrint() {
        println("Internal Print")
    }
}

fun main() {
    Button().click()
//    Button().internalPrint()
    internalPrint()
}

private fun internalPrint() {
    println("Internal Print")
}
