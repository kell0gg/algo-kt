package jump_game_2_45

class Solution {
    fun jump(nums: IntArray): Int {
        if(nums.size == 1) return 0

        var count = 0
        var currentEnd = 0
        var far = 0

        // 그리디 알고리즘
        // 현재지점(i) + 해당 지점에서 가능한 점프(nums[i])를 기록해놓고,
        // 이 지점을 가지고 계속 계산해나가기
        for (i in nums.indices) {
            far = kotlin.math.max(far, i + nums[i])

            // 최대 지점에 도달했을 때, 그 다음 뛸 수 있는 최대로 계산해서 진행
            if (i == currentEnd) {
                count++
                currentEnd = far
            }

            if (currentEnd >= nums.size - 1) return count

        }
        return count
    }
}

// 단순 DFS -> TLE을 기대했는데  stackoverflow가 남..;; -> O(N!) 이라 그런듯
//class Solution {
//    companion object {
//        private var max: Int = 0
//    }
//
//    fun jump(nums: IntArray): Int {
//        max = 0
//        dfs(nums, 0, 0)
//        return max
//    }
//
//    private fun dfs(nums: IntArray, currentIndx: Int, sum: Int) {
//        if (currentIndx >= nums.size) {
//            return
//        }
//
//        if (currentIndx == nums.size - 1) {
//            max = kotlin.math.max(max, sum)
//        }
//
//        for (i in 1..nums[currentIndx]) {
//            // 1칸부터 해당 지점의 값까지 뛸 수 있음
//            dfs(nums, currentIndx + nums[i], sum + 1)
//        }
//    }
//}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.jump(intArrayOf(2, 3, 1, 1, 4))
    println(result)
}