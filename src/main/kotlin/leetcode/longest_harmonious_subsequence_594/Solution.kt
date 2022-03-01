package leetcode.longest_harmonious_subsequence_594

class Solution {
    // 1차이 나는 애들 나오는 횟수 중에 최대를 구하면 됨
    // 일단 각 차이가 1인 애들 더했을 때 최대가 되면 -> 얘네만 뽑았을 때 최대가 됨
    fun findLHS(nums: IntArray): Int {
        val map: MutableMap<Int, Int> = HashMap()
        var result = 0

        for (i in nums) {
            map[i] = map.getOrDefault(i, 0) + 1
        }


        for (i in map.keys) {
            // duplicate check
            if (map.containsKey(i + 1) && map.containsKey(i)) {
                result = kotlin.math.max(result, map[i]!! + map[i + 1]!!)
            }
        }

        return result
    }
}