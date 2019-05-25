package preadfunction

import java.text.SimpleDateFormat
import java.util.*

/**
 * 自定义类的扩展函数
 * 一般用在第三方框架没有的方法，但是我们又需要的情况
 * 还有就是这个方法可能自在本类中进行使用
 */
public fun MethodClass.extendTest(string: String) {
    println(string)

}

// 扩展不可变变量
val MethodClass.date: String get() {

    val f = SimpleDateFormat("yyyy-MM-dd")
    return f.format(Date())
}



fun main(args: Array<String>) {

    val methodClass = MethodClass()
    methodClass.extendTest("扩展函数")
}

