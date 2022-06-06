package leetcode.sort_array_by_parity_905

class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var evenPointer = 0
        var oddPointer = nums.size - 1


        while (evenPointer < oddPointer) {
            if (nums[evenPointer] % 2 == 0) {
                evenPointer++
            } else {
                if (nums[oddPointer] % 2 != 0) {
                    oddPointer--
                }
                // swap

                if (nums[oddPointer] % 2 == 0) {
                    val tmp = nums[oddPointer]
                    nums[oddPointer] = nums[evenPointer]
                    nums[evenPointer] = tmp
                    evenPointer++
                    oddPointer--
                }
            }
        }
        return nums
    }
}

fun main() {
    val solution = Solution()
    val result = solution.sortArrayByParity(intArrayOf(1, 0, 3))
    for (i in result) {
        println(i)
    }
}