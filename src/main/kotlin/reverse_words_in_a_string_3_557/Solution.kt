package reverse_words_in_a_string_3_557

class Solution {
    fun reverseWords(s: String): String {
        // 1. split 으로 단어 별로 쪼갠다.
        // 2. 단어 별로 reverse 하고,
        // 3. 문자열로 만들어서 리턴한다.

        val stringBuilder = StringBuilder()
        val strArr = s.split(" ")

        for (str in strArr) {
            val tmpCa = str.toCharArray()
            reverse(tmpCa, 0, tmpCa.size - 1)
            stringBuilder.append(String(tmpCa))
            stringBuilder.append(" ")
        }

        return stringBuilder.substring(0, stringBuilder.length - 1).toString()
    }

    private fun reverse(ca: CharArray, start: Int, end: Int) {
        var s = start
        var e = end
        while (s < e) {
            val tmp = ca[s]
            ca[s] = ca[e]
            ca[e] = tmp
            s++
            e--
        }
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.reverseWords("abcdef def")
    println(result)
}