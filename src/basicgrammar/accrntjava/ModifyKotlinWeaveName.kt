/***
 * 1、@file:JvmName("KotlinDo") 可以重新命名kt文件名字
 * 2、必须在Package之前添加
 * 3、当有多个名字相同的命名时，使用@file:JvmMultifileClass，会把所有的类合在一起
 */
@file:JvmName("KotlinDo")
@file:JvmMultifileClass


package basicgrammar.accrntjava


fun doSomething() {
    print("使用注解重新命名Kotlin文件")
}

