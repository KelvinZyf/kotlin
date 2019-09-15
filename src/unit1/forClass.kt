package unit1

fun main(args: Array<String>) {


    // 闭合区间 输出1、2、3、4、5、6、7、8、9、10
    for (i in 1..10) {
        println(i)
    }
    println("####################")

    // 半开合区间 输出1、2、3、4、5、6、7、8、9
    for (i in 1 until 10 ) {
        println(i)
    }
    println("####################")

    // 闭合区间 输出10、9、8、7、6、5、4、3、2、1
    for (i in 10 downTo  1 ) {
        println(i)
    }
    println("####################")

    // 循环的间隔为2  输出为1、3、5、7、9
    for (i in 1..10 step 2 ) {
        println(i)
    }
    println("####################")

    // 使用默认的函数
    repeat(10) {
        println(it)
    }
    println("####################")

    // 传入高阶函数
    val addFunction: (Int) -> Unit = { int: Int -> TT().addNumber(int) }
    repeat(
        10,
        addFunction
    )
    println("####################")

    val list = arrayListOf<String>()
    list.add("张三")
    list.add("里斯")
    list.add("汪汪")
    list.add("找刘")

    for (i in 0 until list.size) {
        println(list[i])
    }
    println("####################")


    // map可以直接使用解构，  但是List集合需要使用withIndex()方法进行转换
    for ((key, value) in list.withIndex()) {
        println("在${key}位置上的值为$value")
    }


}


class TT {

    fun addNumber(int: Int) {
        println(int * 2)
    }
}


