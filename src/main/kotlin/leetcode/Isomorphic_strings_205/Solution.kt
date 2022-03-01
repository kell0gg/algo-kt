package leetcode.Isomorphic_strings_205

class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {

        if (s.length != t.length || s.isNullOrEmpty() || t.isNullOrEmpty()) {
            return false
        }

        val mapS: MutableMap<Char, Int> = HashMap()
        val mapT: MutableMap<Char, Int> = HashMap()

        // 현재 값이 나온 이전 인덱스를 기록하면서 비교

        for (i in s.indices) {
            if (mapS.getOrDefault(s[i], -1) != mapT.getOrDefault(t[i], -1)) {
                return false
            }
            mapS[s[i]] = i
            mapT[t[i]] = i
        }
        return true
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result: Boolean = solution.isIsomorphic("abc", "cdd")
    println(result)
}