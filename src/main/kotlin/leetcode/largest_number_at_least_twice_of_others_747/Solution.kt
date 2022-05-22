package leetcode.largest_number_at_least_twice_of_others_747


fun main() {
    val solution = Solution()
    val result = solution.dominantIndex(intArrayOf(3, 6, 1, 0))

    println(result)
}

class Solution {
    fun dominantIndex(nums: IntArray): Int {
        // 1. 가장 큰 수를 찾고
        // 2. 그 수가 다른 애들보다 두 배 커야함
        // 3. 단순 반복하면 O(n^2)
        // 4. 한 번 정렬하고, 가장 큰 수랑 두 번째 큰 수만 비교하면 됨

        if (nums.size == 1) return 0

        val sorted = nums.sortedArray()
        if (sorted[sorted.size - 1] >= sorted[sorted.size - 2] * 2) {
            for (i in nums.indices) {
                if (nums[i] == sorted[sorted.size - 1]) return i
            }
        } else {
            return -1
        }
        return -1
    }
}