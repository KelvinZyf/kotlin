package higherorderfunction


// Unit 代表的是一个没有类型的树

fun main(args: Array<String>) {
//    isLyif(true) {
//        println("高阶函数")
//    }


    isLyif(true) {
        a -> println(a)
    }

    addFunction()
}

/**
 * 高阶函数，  函数（lambda）的参数是一个函数（lambda）
 * 第二个参数是一个lambda表达式
 */
fun isLyif(isDebug: Boolean, block: (name: String) -> Unit) {
    if (isDebug) {
        var name = "高阶函数"
        block(name)
    }
}

fun isLyif(isDebug: Boolean, block: () -> Unit) {
    if (isDebug) {
        block()
    }
}

//函数的声明
val runnable = Runnable {
    println("Runnable :: run")
}


fun addFunction() {
    // 可以使用对象:: 方法名的形式赋值一个方法对象
    var addFunction: () -> Unit = runnable :: run
    isLyif(true, addFunction)
}


