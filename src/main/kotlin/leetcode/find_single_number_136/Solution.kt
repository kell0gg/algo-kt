package leetcode.find_single_number_136

class Solution {
    fun singleNumber(nums: IntArray): Int {

        val map: MutableMap<Int, Int> = HashMap()
        nums.forEach { map.put(it, map.getOrDefault(it, 0) + 1) }

        for(i in map.entries){
            if(i.value==1){
                return i.key
            }
        }

        return -1
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    solution.singleNumber(intArrayOf(1,2,3))
}