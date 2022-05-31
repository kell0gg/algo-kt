package leetcode.most_common_word_819

import java.lang.StringBuilder

class Solution {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val bannedSet: MutableSet<String> = HashSet()
        val map: MutableMap<String, Int> = HashMap()
        val stringBuilder = StringBuilder()
        var max = 0
        var answer = ""

        banned.forEach { bannedSet.add(it) }

        for (c in paragraph) {
            if (c.isLetter()) {
                stringBuilder.append(c.toLowerCase())
            } else {
                stringBuilder.append(" ")
            }
        }

        val words = stringBuilder.toString().split(" ")

        for (word in words) {
            if (bannedSet.contains(word)) continue
            if (word.isBlank()) continue
            map[word] = map.getOrDefault(word, 0) + 1
        }

        for (m in map) {
            if (m.value > max) {
                answer = m.key
                max = m.value
            }
        }

        return answer
    }
}

fun main() {
    val solution = Solution()
    val result = solution.mostCommonWord("a, a, a, a, b,b,b,c, c", arrayOf("a"))
    println(result)
}