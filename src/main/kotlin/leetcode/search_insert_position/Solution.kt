package leetcode.search_insert_position

class Solution {
    // lower bound
    fun searchInsert(nums: IntArray, target: Int): Int {

        var left: Int = 0
        var right: Int = nums.size

        //var right: Int = nums.size - 1
        // 선언한 배열 범위를 넘어서도 위치할 수 있으므로 한 칸 늘려줘야 함


        while (left < right) {
            var mid: Int = left + ((right - left) / 2)

            if (target <= nums[mid]) {
                right = mid
            } else if (nums[mid] < target) {
                left = mid + 1
            } else {
                // pass
            }
        }
        return left
    }
}

fun main(args: Array<String>) {
    val solution: Solution = Solution()

    val nums: IntArray = intArrayOf(-1, 3, 5, 6)
    val target: Int = 0

    println(solution.searchInsert(nums, target))
}