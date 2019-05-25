package basicgrammar.primer

var age = 18   // 可变变量
val name = "kevin" // 不可变变量

var a: Int = 18  // 声明变量类型

var name1: String = "cz" // 值不可为空
var name2: String? = "wt"  // 代表值可为空


fun main() {

//    name1 = null //无法赋值,因为name1不可为空

    //如果想要把一个可为空数赋值给一个定义不可为空的变量时，必须使用！！进行强转
    name1 = name2!!
    getValue(name1)
}

/**
 * Kotlin 定义一个参数
 */
fun getValue(string: String) : String {

    // kotlin 定义一个模版答应字符串
    println("参数内容是$string")
    return string

}