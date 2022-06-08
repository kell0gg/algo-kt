package leetcode.long_pressed_name_925

class Solution {
    fun isLongPressedName(name: String, typed: String): Boolean {
        var i = 0
        var j = 0
        while (i < name.length) {
            var tmp = name[i]
            var countName = 0
            var countTyped = 0
            while (i < name.length) {
                if (tmp == name[i]) {
                    i++
                    countName++
                } else {
                    break
                }
            }
            while (j < typed.length) {
                if (tmp == typed[j]) {
                    j++
                    countTyped++
                } else {
                    break
                }
            }
            if (countName > countTyped) return false

            if (i < name.length && j < typed.length && name[i] != typed[j]) return false
        }

        if (j != typed.length) return false

        return true
    }
}

fun main() {
    /*
    "leelee"
    "lleeelee"
     */

    val solution = Solution()
    val result = solution.isLongPressedName("leelee", "lleeelee")
    println(result)
}