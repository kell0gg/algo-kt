package leetcode.execl_sheet_column_number_171

class Solution {
    fun titleToNumber(columnTitle: String): Int {
        if (columnTitle.isNullOrEmpty()) return -1

        var sum: Int = 0
        columnTitle.forEach {
            sum *= 26
            val tmp: Int = (it - 'A').toInt() + 1
            sum += tmp
        }
        return sum
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.titleToNumber("ZY")
    println(result)
}