package license_key_formatting_482

import java.util.*


class Solution {
    fun licenseKeyFormatting(s: String, k: Int): String {

        val sb = StringBuilder()
        for (i in s.length - 1 downTo 0) {
            if (s[i] != '-') {
                if (sb.length % (k + 1) == k) sb.append("-")
                sb.append(s[i])
            }
        }

        return sb.reverse().toString().toUpperCase()
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.licenseKeyFormatting("", 1)
    println(result)
}