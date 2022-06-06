package leetcode.reverse_only_letters_917

class Solution {
    fun reverseOnlyLetters(s: String): String {
        var tmpS = s.toCharArray()
        var left = 0
        var right = s.length - 1

        while (left < right) {
            if (!(tmpS[left] in 'a'..'z' || tmpS[left] in 'A'..'Z')) left++
            if (!(tmpS[right] in 'a'..'z' || tmpS[right] in 'A'..'Z')) right--

            // swap
            if ((tmpS[left] in 'a'..'z' || tmpS[left] in 'A'..'Z') && (tmpS[right] in 'a'..'z' || tmpS[right] in 'A'..'Z')) {
                val tmp = tmpS[left]
                tmpS[left] = tmpS[right]
                tmpS[right] = tmp

                left++
                right--
            }
        }

        return String(tmpS)
    }
}

fun main() {
    val solution = Solution()
    val result = solution.reverseOnlyLetters("7_28_]")
    println(result)
}