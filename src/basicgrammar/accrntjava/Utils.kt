package basicgrammar.accrntjava

import kotlin.reflect.KClass

fun main() {

    echo("方法")
    Test.sayMessage("内部类")

    // 调用Java非静态方法
    JavaClass().addValue()
    // 调用Java静态方法
    JavaClass.addValue1()

    // kotlin调用java的类class
    getJavaClass(JavaClass::class.java)

    // kotlin调用Kotlin的类class
    getKotlinClass(KotlinClass::class)

    // java文件中变量与Kotlin产生冲突时，使用``进行解决
    println(JavaClass.`in`)
}

fun echo(name: String) {

    println(name)
}

/**
 * 传入Java类的class时，参数名字是Class<T>，传入的参数是  类名::class.java
 */
fun getJavaClass(clazz: Class<JavaClass>) {
    println(clazz.simpleName)
}

/**
 * 传入Kotlin类的class时，参数名字是Class<T>，传入的参数是 类名::class
 */
fun getKotlinClass(clazz: KClass<KotlinClass>) {
    println(clazz.simpleName)
}

// Kotlin声明 内部类
object Test {

    fun  sayMessage(msg: String) {
        println(msg)
    }
}