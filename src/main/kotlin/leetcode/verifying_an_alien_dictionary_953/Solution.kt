package leetcode.verifying_an_alien_dictionary_953

class Solution {
    companion object {
        val map: MutableMap<Int, Int> = HashMap()
    }

    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        initMpa(order)

        for (i in 1 until words.size) {
            if (compare(words[i - 1], words[i])) return false
        }
        return true
    }

    private fun initMpa(order: String) {
        for (i in order.indices) {
            map[order[i] - 'a'] = i
        }
    }

    private fun compare(s1: String, s2: String): Boolean {
        var l1 = s1.length
        var l2 = s2.length

        var idx1: Int = 0
        var idx2: Int = 0

        while (idx1 < l1 && idx2 < l2) {
            if (s1[idx1] != s2[idx2]) {
                return map[s1[idx1] - 'a']!! > map[s2[idx2] - 'a']!!
            }
            idx1++
            idx2++
        }
        return l1 > l2
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.isAlienSorted(arrayOf("hello", "leetcode"), "hlabcdefgijkmnopqrstuvwxyz")
    println(result)
}