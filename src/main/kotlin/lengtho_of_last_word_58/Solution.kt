package lengtho_of_last_word_58

class Solution {
    fun lengthOfLastWord(s: String): Int {
        return s.trim().split(" ").last().length
    }
}

fun main(args: Array<String>) {
    // pass
}