package leetcode.two_sum_01

class Solution {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map: MutableMap<Int, Int> = mutableMapOf()
        nums.forEachIndexed{index, value ->
            val diff = target - value

            // !! will throw NullPointerException if the value is null
            if(map.containsKey(diff)) return intArrayOf(map[diff]!!, index)
            map[value] = index
        }
        return intArrayOf(-1, -1)
    }
}

fun main(args: Array<String>) {
    val solution = Solution();
    val nums: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val target = 5;
    var a = solution.twoSum(nums, target);
    print(a[0])
}
