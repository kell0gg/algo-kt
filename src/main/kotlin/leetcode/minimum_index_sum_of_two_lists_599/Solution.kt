package leetcode.minimum_index_sum_of_two_lists_599

class Solution {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {

        val result: MutableList<CommonInterest> = ArrayList()
        var min = Int.MAX_VALUE

        for (l1 in list1.withIndex()) {
            for (l2 in list2.withIndex()) {
                // == -> 내부적으로 equal 호출
                if (l1.value == l2.value) {
                    val tmp = l1.index+l2.index
                    min = kotlin.math.min(min, tmp)
                    result.add(CommonInterest(tmp,l1.value))
                }
            }
        }
        return result.filter { it.idx == min }.map { it.interest }.toTypedArray()
    }
}

class CommonInterest(val idx: Int, val interest: String) {}