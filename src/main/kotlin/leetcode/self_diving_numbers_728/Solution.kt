package leetcode.self_diving_numbers_728

class Solution {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val result: MutableList<Int> = ArrayList()

        for (num in left..right) {
            if (findSelfDivingNumber(num)) result.add(num)
        }
        return result.toList()
    }

    private fun findSelfDivingNumber(num: Int): Boolean {
        var tmpNum = num

        while (tmpNum != 0) {
            val remainder = tmpNum % 10
            if (remainder == 0) {
                return false
            }
            if (num % remainder != 0) {
                return false
            }
            tmpNum /= 10
        }
        return true
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.selfDividingNumbers(1, 22)

    for (i in result) {
        println(i)
    }
}