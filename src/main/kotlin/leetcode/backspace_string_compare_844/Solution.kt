package leetcode.backspace_string_compare_844

import java.util.*

class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        val stackS: Stack<Char> = Stack()
        val stackT: Stack<Char> = Stack()

        for (c in s) {
            if (c == '#') {
                if (!stackS.isEmpty()) { stackS.pop() }
            } else {
                stackS.add(c)
            }
        }
        for (c in t) {
            if (c == '#') {
                if (!stackT.isEmpty()) { stackT.pop() }
            } else {
                stackT.add(c)
            }
        }

        if (stackS.size != stackT.size) return false

        while (!stackS.isEmpty() || !stackT.isEmpty()) {
            if (stackS.pop() != stackT.pop()) return false
        }
        return true
    }
}

fun main() {
    /*
    "ab##"
    "c#d#"
     */
    val solution = Solution()
    val result = solution.backspaceCompare("ab##", "c#d#")
    println(result)
}