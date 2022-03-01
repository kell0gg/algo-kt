package leetcode.find_all_numbers_disappeared_in_an_array_448

class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        var arr: Array<Int> = Array(nums.size) { 0 }
        val list: MutableList<Int> = ArrayList()
        nums.forEach { arr[it - 1]++ }

        for(i in arr.withIndex()){
            if(i.value==0){
                list.add(i.index+1)
            }
        }
        return list
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.findDisappearedNumbers(intArrayOf(1, 2, 3, 2, 3))
    result.forEach { println(it) }
}