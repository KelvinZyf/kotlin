package unit2

fun main(args: Array<String>) {

   myOperator()
}

fun kotlinOperator() {
    val a = arrayOf("4", "0", "7", "i", "f", "w", "0", "9")
    val index = arrayOf(5, 3, 9, 4, 8, 3, 1, 9, 2, 1, 7)

    // filter 过滤出 小于a数组长度的值
    // map 变形 取出a数组中在filter过滤的数字所在下标的内容
    // reduce 字符串合并， 把上一次合并的字符串和新传过来的字符进行合并
    // also  当所有的操作都完成了，最终输出的结果
    index.filter {
        it < a.size
    }.map {
        a[it]
    }.reduce { acc, s ->
        "$acc$s"
    }.also {
        print("密码是：$it")
    }
}

fun myOperator() {
    val list: List<Int> = listOf(1,2,3,4,5)
    list.convert {
        it + 1
    }.forEach {
        println(it)
    }

}

/**
 * 扩展Iterable方法convert 所有的集合都可以使用
 * convert方法中，传入一个lamba表达式
 * lamba表达式中是 传入一个参数，然后返回另外一个参数
 * 这个方法最终会返回一个可变的集合
 */
inline fun<T, E> Iterable<T>.convert(action:(T) -> E): MutableList<E> {
    val list: MutableList<E> = mutableListOf()
    for (item in this) {
        list.add(action(item))
    }
    return list
}