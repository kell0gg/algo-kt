package leetcode.two_sum_2_167

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1;

        while (left < right) {
            var _tmpSum = numbers[left] + numbers[right]
            if (_tmpSum == target) {
                return intArrayOf(left + 1, right + 1)
            }
            if (_tmpSum > target) {
                right--
            }
            if (_tmpSum < target) {
                left++
            }
        }

        // not reached
        return intArrayOf(-1,-1)
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result: IntArray = solution.twoSum(intArrayOf(1,2,3,4,5), 4)

    for(i in result){
        println(i)
    }
}