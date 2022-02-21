package base_7_504

class Solution {
    fun convertToBase7(num: Int): String {
        // 나머지 2, 몫 14
        // 나머지 0, 몫 2
        // 나머지 2, 몫 0
        var quotient = num
        var remainder = 0
        val sb = StringBuilder()

        if (num < 0) {
            return "-" + convertToBase7(-num)
        }

        do {
            remainder = quotient % 7
            quotient /= 7
            sb.append(remainder)

        } while (quotient != 0)

        return sb.reverse().toString()
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.convertToBase7(-7)
    println(result)
}