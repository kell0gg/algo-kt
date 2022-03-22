package leetcode.find_pivot_index_724

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        // 1. 전체 합을 구한다.
        // 2. 왼쪽부터 한 칸씩 이동하면서 값을 뺀다.
        // 3. 값을 뺀 만큼 새로 변수를 만들어서 더한다.
        // 4. 두 값을 비교한다.

        // * 전체 다 합쳐도 10^4 * 1000 이니까 충분히 커버 가능
        // * 배열 크기가 1인 경우 -> 좌측, 우측 모두 0이니까 0 그대로 return
        if (nums.size == 1) {
            return 0
        }

        var pivotIdx = 0
        var rightSum = nums.sum() - nums[pivotIdx]
        var leftSum = 0

        while (pivotIdx < nums.size) {

            if (leftSum == rightSum) {
                return pivotIdx
            } else {
                if (pivotIdx + 1 < nums.size) {
                    rightSum -= nums[pivotIdx + 1]
                    leftSum += nums[pivotIdx]
                }
                pivotIdx++
            }
        }

        return -1
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    // val result = solution.pivotIndex(intArrayOf(2, -1, 1))
    // val result = solution.pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6))
    // val result = solution.pivotIndex(intArrayOf(-1, -1, 0, 1, 1, 0))
    val result = solution.pivotIndex(intArrayOf(1, 2, 3))
    println(result)
}