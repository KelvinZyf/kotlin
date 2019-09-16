package unit4

fun main(args: Array<String>) {

    // 中缀表达式可以直接调用，一般中缀表达式  多用于两个相近类型比较，不做表达式操作
    println(5.vs(6))
}

/**
 * infix 定义中缀表达式
 */
infix fun Int.vs(number: Int): CompareResult {

    if (this - number < 0) {
        return CompareResult.LESS
    } else if (this - number > 0) {
        return CompareResult.MORE
    } else {
        return CompareResult.EQUAL
    }
}


/**
 * 密闭类，可以当作枚举
 */
sealed class CompareResult {

    object LESS: CompareResult() {
        override fun toString(): String {
            return "小于"
        }
    }

    object MORE: CompareResult() {
        override fun toString(): String {
            return "大于"
        }
    }

    object EQUAL: CompareResult() {
        override fun toString(): String {
            return "相等"
        }
    }
}