package leetcode.implement_strStr_28

class Solution {
    fun strStr(haystack: String, needle: String): Int {

        if(needle.isEmpty()) return 0

        val start: Char = needle[0]
        val size: Int = needle.length

        var indexForHaystack = 0

        while (indexForHaystack < haystack.length) {
            if (haystack[indexForHaystack] == start && (indexForHaystack + size) <= haystack.length) {

                var isMatched = true

                for (i in 1 until size) {
                    if (haystack[indexForHaystack + i] != needle[i]) {
                        isMatched = false
                        break
                    }
                }

                if (isMatched) {
                    return indexForHaystack
                }
            }

            indexForHaystack++
        }
        return -1
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val index = solution.strStr("abcd","")
    print(index)
}