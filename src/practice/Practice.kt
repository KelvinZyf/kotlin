package practice



fun main(args: Array<String>) {

    printString()
}

fun printString() {
    val name = "Cz"
    val age = 18

//    println("我叫%d, 我今年%d岁", name, age)

    println("我叫$name, 我今年{$age}岁")

}

object Test {

    @JvmStatic
    fun sayMessage(msg: String?) {
        println(msg)
    }
}