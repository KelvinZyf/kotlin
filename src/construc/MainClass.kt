package construc

open class MainClass(val name: String) {

    // init 方法会在调用构造函数的时候，调用这个方法
    init {
        println("调用了构造函数")
    }

    // 重写构造函数时，需要继承主构造函数
    constructor(name: String, age: Int) : this(name) {

    }

    private fun printInfo() {
        println(name)
    }


    // 修饰符： private protected public 这三个同Java  internal ：Kotlin特有的修饰符，表示在同一个模块中可以调用，模块是指当前了所在的module
    //
}