package reverse_string_344

class Solution {
    fun reverseString(s: CharArray): Unit {
        // O(1) extra memory
        for (i in 0 until (s.size / 2)) {
            val tmp = s[i]
            s[i] = s[s.size - 1 - i]
            s[s.size - 1 - i] = tmp
        }
    }
}

fun main(args: Array<String>) {
    for (i in 0..(4 / 2)) {
        print(i)
    }
}