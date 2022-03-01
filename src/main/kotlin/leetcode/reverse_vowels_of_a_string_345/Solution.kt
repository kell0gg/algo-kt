package leetcode.reverse_vowels_of_a_string_345

class Solution {
    fun reverseVowels(s: String): String {

        var charArray = s.toCharArray()
        var left: Int = 0
        var right: Int = s.length - 1
        val set: Set<Char> = hashSetOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

        while (left < right) {

            while (left < s.length - 1 && !set.contains(s[left])) {
                left++
            }
            while (right >= 0 && !set.contains(s[right])) {
                right--
            }

            if (left < right) {
                val tmp = charArray[left]
                charArray[left] = charArray[right]
                charArray[right] = tmp
            }

            left++
            right--
        }
        // return charArray.concatToString()
        return charArray.joinToString("")
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.reverseVowels("leetcode")
    println(result)
}