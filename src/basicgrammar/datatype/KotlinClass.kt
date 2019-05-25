package basicgrammar.datatype

fun main() {
    var a = A()

    // Kotlin中没有Integer类，所以只可能调用int类型
    a.putNumber(123)

    function("")

    Test.staticMethod()

}

fun function(string: String) {
    var format1 = A.format(string)  // 系统推断变量类型
//    var format2: String = A.format(string) // 不可空类型，当值为空时，会报空指针
    var format3: String? = A.format(string) // 可控类型
    println(format1)
    println(format3)
}



object Test {

    @JvmStatic
    fun staticMethod() {
        println("Kotlin静态方法")
    }
}