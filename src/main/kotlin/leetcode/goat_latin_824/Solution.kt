package leetcode.goat_latin_824

class Solution {
    fun toGoatLatin(sentence: String): String {
        val words = sentence.split(" ")
        var idx = 1
        var stringBuilder = StringBuilder()
        for (word in words) {
            if (word[0] == 'a' || word[0] == 'i' || word[0] == 'o' || word[0] == 'e' || word[0] == 'u' ||
                word[0] == 'A' || word[0] == 'I' || word[0] == 'O' || word[0] == 'E' || word[0] == 'U'
            ) {
                stringBuilder.append(word)
                stringBuilder.append("ma")
            } else if (word[0].isLetter()) {
                stringBuilder.append(word.substring(1, word.length))
                stringBuilder.append(word[0])
                stringBuilder.append("ma")
            } else {
                // exception
            }
            for (i in 0 until idx) {
                stringBuilder.append('a')
            }
            stringBuilder.append(' ')
            idx++
        }
        return stringBuilder.substring(0, stringBuilder.length - 1).toString()
    }
}

fun main() {
    val solution = Solution()
    val result = solution.toGoatLatin("I speak Goat Latin")
    println(result)
}