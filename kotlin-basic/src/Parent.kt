open class Parent(val familyName: String)

/*class Child : Parent {
    private val subName: String

    constructor(subName: String) : this(subName, "")

    constructor(subName: String, familyName: String) : super(familyName) {
        this.subName = subName
    }
}*/

class Child(
    private val subName: String,
    familyName: String
) : Parent(familyName)

class Account {
    var balance: Long = 0
        private set
    /*set(value) {
        if (value < 0) throw IllegalArgumentException("음수 잔액은 불가능합니다.")
        field = value
    }*/

    var accountName: String = ""
        get() = "계좌이름:$field"


    fun increaseBalance(value: Int) {
        this.balance += value
    }

    fun decreaseBalance(value: Int) {
        this.balance -= value
    }
}

fun main() {
    val child = Child("benny", "ham")
    println("familyName is ${child.familyName}")

    val account = Account()
//    account.balance = 100
    account.increaseBalance(100)
    account.accountName = "급여계좌"

    println("balance : ${account.balance}, name: ${account.accountName}")

//    account.balance = -100
    account.decreaseBalance(100)
    account.accountName = "급여계좌(수정)"

    println("balance : ${account.balance}, name: ${account.accountName}")
}
