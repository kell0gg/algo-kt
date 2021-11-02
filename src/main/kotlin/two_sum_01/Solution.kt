package two_sum_01

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                val tmp: Int = nums[i] + nums[j]
                if (tmp == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf(-1, -1)
    }
}
fun main(args: Array<String>) {
    val solution = Solution();
    val nums: IntArray = intArrayOf(1,2,3,4,5)
    val target = 5;
    var a = solution.twoSum(nums, target);
    print(a[0])
}
