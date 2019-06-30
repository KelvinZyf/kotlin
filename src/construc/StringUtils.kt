package construc

class StringUtils {

    companion object {

        // 工具类形式
        fun isEmpty(string: String): Boolean {
            return "" == string
        }
    }
}

// 构造器私有,单利写法
class Single private constructor() {

    companion object {
        fun instance(): Single {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = Single()
    }
}
fun main(args: Array<String>) {

    println(StringUtils.isEmpty("sss"))
}