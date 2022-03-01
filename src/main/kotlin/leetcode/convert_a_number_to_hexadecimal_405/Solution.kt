package leetcode.convert_a_number_to_hexadecimal_405

class Solution {
    fun toHex(num: Int): String {
        if(num == 0) return "0"

        // 0 ~ 15
        val map = "0123456789abcdef"
        val sb = StringBuilder()
        var num = num.toUInt()

        while (num > 0u) {
            sb.append(map[(num % 16u).toInt()])
            num /= 16u
        }

        return sb.reverse().toString()
    }
}

fun main(args: Array<String>) {
    // pass
}