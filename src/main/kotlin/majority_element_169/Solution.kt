package majority_element_169

class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map: MutableMap<Int, Int> = HashMap()

        nums.forEach { map.put(it, map.getOrDefault(it, 0) + 1) }

        for (i in map.entries) {
            if (i.value > nums.size / 2) {
                return i.key
            }
        }
        return -1
    }
}

fun main(args: Array<String>) {
    val nums = intArrayOf(1, 2, 3, 1)
    val solution: Solution = Solution()
    val result = solution.majorityElement(nums)
    println(result)
}