package unit

class User(val age: Int, val name: String){


    /**
     * componentN 是操作符， 前面必须加 operator
     */
    operator fun component1(): Int {
        return age
    }

    operator fun component2(): String {
        return name
    }
}