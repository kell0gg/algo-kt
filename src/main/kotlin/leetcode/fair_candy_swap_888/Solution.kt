package leetcode.fair_candy_swap_888

class Solution {
    fun fairCandySwap(aliceSizes: IntArray, bobSizes: IntArray): IntArray {

        var aliceSet: MutableSet<Int> = HashSet()
        var aliceSum = 0
        aliceSizes.forEach {
            aliceSet.add(it)
            aliceSum += it
        }

        var bobSum = bobSizes.sum()

        val diff = (aliceSum - bobSum) / 2
        for (bobSize in bobSizes) {
            val a = bobSize + diff
            if (aliceSet.contains(a)) {
                return intArrayOf(a, bobSize)
            }
        }

        return intArrayOf(-1, -1)
    }
}

fun main() {
    val solution = Solution()
    val result = solution.fairCandySwap(intArrayOf(1, 1), intArrayOf(2, 2))
    println(result[0])
    println(result[1])
}