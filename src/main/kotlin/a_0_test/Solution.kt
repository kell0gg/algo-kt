package a_0_test

class Solution {
}

fun main(args: Array<String>) {

}

class Test(name: String) {
    var name: String = name
        get() = name
        set(value) {
            field = value
        }
}

class Person(name: String, age: Int) {

    var name: String = name
        get() = name
        set(value) {

            field = value
        }

    var age: Int = age
        get() {
            return age + 12
        }
        set(value) {
            field = value
        }

}