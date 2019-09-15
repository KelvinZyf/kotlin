package unit

fun main(args: Array<String>) {

    val user = User(18, "刘秀")

    // 解构声明
    val(n, i) = user

    println("$n  ,  $i")

    test()
}


private fun test() {

    val map = hashMapOf<String, Int>()
    map["one"] = 1
    map["two"] = 2
    map["three"] = 3
    map["four"] = 4
    map["five"] = 5

    for ((n, i) in map) {
        println("$n , $i")
    }
}