package leetcode.contain_duplicate_218

class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        // 1. input -> map[ value ] [ index ]
        // 2. 값이 있으면? 기존에 들어간 인덱스 위치를 비교
        // 3. 값이 없으면? map에 넣기
        val map: MutableMap<Int, Int> = HashMap()
        val set: MutableSet<Int> = HashSet()

        for (i in nums.indices) {
            if (!map.containsKey(nums[i])) {
                map[nums[i]] = i
            } else {
                // 비교
                val s = i - map.getOrDefault(nums[i], 0)
                // println("diff $s")
                if (s <= k) {
                    return true
                }
            }
            map[nums[i]] = i
        }
        return false
    }
}

fun main(args: Array<String>) {
    val nums = intArrayOf(1, 2, 3, 1, 2, 3)
    val k = 2
    val solution = Solution()
    val result = solution.containsNearbyDuplicate(nums, k)
    println(result)
}