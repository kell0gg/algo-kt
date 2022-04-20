package leetcode.majority_element_2_229

class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        // 1. O(1) space 는 포기

        val majorityCount = nums.size / 3
        val map: MutableMap<Int, Int> = HashMap()
        nums.asSequence().forEach { map[it] = map.getOrDefault(it, 0) + 1 }
        return map.filter { it.value > majorityCount }.map { it.key }.toList()
    }
}