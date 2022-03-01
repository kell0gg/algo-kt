package leetcode.find_the_difference_389

class Solution {
    fun findTheDifference(s: String, t: String): Char {

        val sm: Map<Char, List<Char>> = s.toCharArray().groupBy { it }
        val tm: Map<Char, List<Char>> = t.toCharArray().groupBy { it }

        for (i in tm) {
            if (!sm.containsKey(i.key)) {
                return i.key
            } else {
                if (sm.getOrDefault(i.key, arrayListOf()).size != i.value.size) return i.key
            }
        }

        return 'e'
    }
}