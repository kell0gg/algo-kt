package leetcode.detect_capital_520

class Solution {
    fun detectCapitalUse(word: String): Boolean {
        val capitalCount = word.filter { it.isUpperCase() }.count()
        return (capitalCount == word.length || capitalCount == 0 || (capitalCount == 1 && word[0].isUpperCase()))
    }
}