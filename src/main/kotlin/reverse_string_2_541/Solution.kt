package reverse_string_2_541

class Solution {
    fun reverseStr(s: String, k: Int): String {

        val ca = s.toCharArray()

        for (i in s.indices step (2 * k)) {
            reverse(ca, i, i + k)
        }

        return String(ca)
    }

    private fun reverse(ca: CharArray, start: Int, end: Int) {
        var ts = start
        var te = kotlin.math.min(end, ca.size) - 1
        while (ts < te) {
            val tmp = ca[ts]
            ca[ts] = ca[te]
            ca[te] = tmp
            ts++
            te--
        }
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.reverseStr("abcdefg", 2)
    println(result)
}