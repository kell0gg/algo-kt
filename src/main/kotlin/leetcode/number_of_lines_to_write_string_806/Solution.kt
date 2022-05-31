package leetcode.number_of_lines_to_write_string_806

class Solution {
    companion object {
        private val PIXELS_WIDE = 100
    }

    fun numberOfLines(widths: IntArray, s: String): IntArray {
        var current = 0
        var count = 1

        for (i in s.indices) {
            val idx = s[i] - 'a'
            if (current + widths[idx] > PIXELS_WIDE) {
                count++
                current = widths[idx]
            } else {
                current += widths[idx]
            }
        }
        return intArrayOf(count, current)
    }
}