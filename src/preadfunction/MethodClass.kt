package preadfunction



fun main(args: Array<String>) {

    getValue() // 不传递参数时，会打印默认值

    function()

}

/**
 * 方法中设置参数设置默认值
 */
fun getValue(string: String = "CZ"): String? {
    println(string)
    return string
}

// 方法体只有一句时
fun getValue() = println("只有一句话时，直接赋值")

/**
 * 嵌套函数
 * 在某些条件下出发递归函数
 * 不希望被外部函数访问到的函数
 */
fun function() {
    val str = "hello world"

    fun say(count: Int = 10) {
        println(str)
        if (count > 0) {
            say(count - 1)
        }
    }

    say()
}


class MethodClass {

}