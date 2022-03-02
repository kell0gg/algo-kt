package leetcode.maximum_product_of_three_numbers_628

class Solution {
    fun maximumProduct(nums: IntArray): Int {

        // 1. 3개를 뽑아서 최대가 되어야 함
        // 2. 정렬 후 -> 가장 큰 3개 곱하기
        if (nums.size < 3) {
            // 3. 입력이 3보다 큰 값으로 들어오도록 되어있지만 이중 방어
            return 0
        }
        val sortedNums = nums.sortedArray()

        // 두 가지 케이스 존재 -> 짝, 짝, 짝 or 짝, 홀, 홀

        return kotlin.math.max(
            sortedNums[nums.size - 1] * sortedNums[nums.size - 2] * sortedNums[nums.size - 3],
            sortedNums[0] * sortedNums[1] * sortedNums[nums.size - 1]
        )
    }

//    companion object {
//        private var max = 0
//    }
//
//    fun maximumProduct(nums: IntArray): Int {
//        // 1. 선택을 하거나, 선택을 하지 않거나 둘 중 하나임 -> TLE
//        max = Int.MIN_VALUE
//
//        dfs(nums, 0, 0, 1)
//
//        return max
//    }
//
//    private fun dfs(nums: IntArray, current: Int, count: Int, product: Int) {
//        if (count == 3) {
//            max = kotlin.math.max(max, product)
//        }
//
//        if (current >= nums.size) {
//            return
//        }
//
//        // 선택 했을 때
//        dfs(nums, current + 1, count + 1, product * nums[current])
//
//        // 선택 안했을 때
//        dfs(nums, current + 1, count, product)
//    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.maximumProduct(intArrayOf(1, 2, 3, 4))
    println(result)

}