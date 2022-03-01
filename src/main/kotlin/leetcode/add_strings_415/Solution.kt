package leetcode.add_strings_415

class Solution {
    fun addStrings(num1: String, num2: String): String {
        var idx1 = num1.length - 1
        var idx2 = num2.length - 1

        var sb = StringBuilder()
        var carry = 0
        while (idx1 >= 0 || idx2 >= 0) {
            var x = 0
            if (idx1 >= 0) {
                x = num1[idx1] - '0'
            }

            var y = 0
            if (idx2 >= 0) {
                y = num2[idx2] - '0'
            }

            var tmp = x + y + carry
            sb.append(tmp % 10)
            carry = tmp / 10
            idx1--
            idx2--
        }

        if(carry!=0) sb.append(carry)

        return sb.reverse().toString()
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.addStrings("1", "1")
    println(result)
}
