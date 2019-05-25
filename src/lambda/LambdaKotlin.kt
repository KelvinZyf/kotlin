package lambda

fun main(args: Array<String>) {

    echo22(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1)
    echo23(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1)
}

/**
 * kotlin lambda的参数是放在大括号里面
 */
fun parmarLambda(name: String) {

    val thread = Thread {
        print(name)
    }
    thread.start()
}


val echo = { name: String -> print(name)}

// Kotlin 中的Lambda参数最多可以传递22的参数，当传入23个参数时会报错
val echo22 = { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int, l: Int,
              m: Int, n: Int, o: Int, p: Int, q: Int, r: Int, s: Int, t: Int, u: Int, v: Int -> println("传递了22个参数")
}


// Kotlin1.3之前 中的Lambda参数最多可以传递22的参数，当传入23个参数时会报错，Kotlin1.3之后没有限制了
val echo23 = { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int, l: Int,
               m: Int, n: Int, o: Int, p: Int, q: Int, r: Int, s: Int, t: Int, u: Int, v: Int, w: Int -> println("传递了23个参数")
}
