package contain_duplicate_217

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.groupBy { it }.any { it.value.size >= 2 }
    }
}

fun main(args: Array<String>) {
    val nums = intArrayOf(1, 2, 3, 1)
    val solution = Solution()
    val result = solution.containsDuplicate(nums)
    println(result)
}