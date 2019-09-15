package unit3

data class User(var name: String)

/**
 * Kotlin 的作用域函数
 */
fun main(args: Array<String>) {

    val user = User("Cz")

    // let与run都会返回闭包的执行结果，区别在于let有闭包参数，run没有闭包参数
    // it是返回值，谁调用，就返回谁
    val letResult = user.let {
        "let::${it.javaClass}" }
    println(letResult)
    // 没有返回参数，只能使用this，this代表的是当前调用的类
    val runResult = user.run {
        "run::${this.javaClass}" }
    println(runResult)

    // also与apply都不返回闭包的执行结果，返回的是当前调用的对象，
    // also有闭包参数，apply没有闭包参数
    user.also {
        println("also::${it.javaClass}")
    }.apply {
        println("also::${this.javaClass}")
    }.name = "sss"

    println(user.name)

    // takeIf和takeUnless 都会返回闭包的判断结果
    // takeIf 判断是，如果闭包为true时，返回参数， 为false时，返回空
    // takeUnless与takeIf相反 如果闭包为true时，返回空， 为false时，返回参数
    user.takeIf {
        it.name.isNotEmpty()
    } ?.also {
        println("姓名为：${it.name}")
    } ?: println("姓名为空")

    user.takeUnless {
        it.name.isNotEmpty()
    } ?.also {
        println("姓名为空")
    } ?: println("姓名为：${user.name}")

    with(user) {
        user.name = "hello"
    }
    println(user.name)
}