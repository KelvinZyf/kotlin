package preadfunction

// open 修饰符代表的是此类可继承，一般Kotlin类是不可继承的
open class Animal

class Dog: Animal()

fun Animal.getName() = "Animal"
fun Dog.getName() = "Dog"

fun Animal.name(animal: Animal) {
    println(animal.getName())
}

fun main(args: Array<String>) {
    Dog().name(Dog())
}
