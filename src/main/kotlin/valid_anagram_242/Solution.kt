package valid_anagram_242

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val carrayS = IntArray(26) { 0 }
        val carrayT = IntArray(26) { 0 }


        for (i in s.indices) {
            carrayS[s[i] - 'a']++
            carrayT[t[i] - 'a']++
        }

        for (i in 0 until 26) {
            if (carrayS[i] != carrayT[i]) return false
        }
        return true
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.isAnagram("nl", "cx")

    println(result)
}