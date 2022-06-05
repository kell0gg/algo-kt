package leetcode.uncommon_words_from_two_sentences_884

class Solution {
    fun uncommonFromSentences(s1: String, s2: String): Array<String> {
        val map: MutableMap<String, Int> = HashMap()
        val s1Arr = s1.split(" ")
        val s2Arr = s2.split(" ")

        for (s in s1Arr) {
            map[s] = map.getOrDefault(s, 0) + 1
        }
        for (s in s2Arr) {
            map[s] = map.getOrDefault(s, 0) + 1
        }

        for (s in s1Arr) {
            if (map.containsKey(s) && (map[s]!! >= 2)) {
                map.remove(s)
            }
        }
        for (s in s2Arr) {
            if (map.containsKey(s) && (map[s]!! >= 2)) {
                map.remove(s)
            }
        }
        return map.map { it.key }.toTypedArray()
    }
}

fun main() {
    val solution = Solution()
    val result = solution.uncommonFromSentences("this apple is sweet", "this apple is sour")
    for (i in result) {
        println(i)
    }
}