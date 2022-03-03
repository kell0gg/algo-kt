package leetcode.set_mismatch_645

class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        val map: MutableMap<Int, Int> = HashMap()
        val result: Array<Int> = Array(2) { 0 }

        for (i in 1 .. nums.size) {
            map[i] = 0
        }

        for (i in nums) {
            map[i] = map.getOrDefault(i, 0) + 1
        }

        for (i in map) {
            if (i.value == 2) {
                result[0] = i.key
            }
            if (i.value == 0) {
                result[1] = i.key
            }

        }
        return result.toIntArray()
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.findErrorNums(intArrayOf(1,2,2,4))
    for(i in result){
        println("result -> $i")
    }
}