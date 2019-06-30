package dynamicproxy

// 使用by关键字进行代理，如果该类也重写了Animal中的方法，当调用相同的方法时，会调用该类的方法，而不会调用代理类的方法
class Zon(animal: Animal): Animal by animal {


}

fun main(args: Array<String>) {
    Zon(Dog()).call()
}