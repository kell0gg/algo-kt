package leetcode.reverse_bits_190

class Solution {
    // you need treat n as an unsigned value
    fun reverseBits(n: Int): Int {
        var number = n
        var index = 31
        var mask = 1
        val bits = IntArray(32)

        while (index > -1) {
            val bit = if ((mask and number) == 0) 0 else 1
            bits[index] = bit
            index--
            mask = mask shl 1
            // mask and number -> 마지막 bit가 0인지, 1인지를 구하기
            // 00000000000000000000000000000001 & 10101010101010101010101010101010 => 0
            // 00000000000000000000000000000010 & 10101010101010101010101010101010 => 1
            // 00000000000000000000000000000100 & 10101010101010101010101010101010 => 0
            // 00000000000000000000000000001000 & 10101010101010101010101010101010 => 1
        }

        var result = 0
        var multiplier = 1

        for (i in 0 until 32) {
            result += bits[i] * multiplier
            multiplier *= 2
        }
        return result
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.reverseBits(1210061376)
    println(result)
}