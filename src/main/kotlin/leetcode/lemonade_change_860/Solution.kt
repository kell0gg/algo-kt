package leetcode.lemonade_change_860

class Solution {
    fun lemonadeChange(bills: IntArray): Boolean {
        var five = 0
        var ten = 0

        for (bill in bills) {
            when (bill) {
                5 -> five++
                10 -> {
                    five--
                    ten++
                }
                20 -> {
                    if (ten >= 1 && five >= 1) {
                        ten--
                        five--
                    } else {
                        five -= 3
                    }
                }
            }
            if (five < 0) return false
        }

        return true
    }
}

fun main() {
    val solution = Solution()
    val result = solution.lemonadeChange(intArrayOf(5, 5, 5, 10, 20))
    println(result)
}