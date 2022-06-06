package leetcode.x_of_a_kind_in_a_deck_of_cards_914

class Solution {
    fun hasGroupsSizeX(deck: IntArray): Boolean {

        val map: MutableMap<Int, Int> = HashMap()
        for (card in deck) {
            map[card] = map.getOrDefault(card, 0) + 1
        }

        var size = -1
        for (me in map) {
            if (size == -1) {
                size = me.value
            } else {
                size = greateCommonDivisor(size, me.value)
            }
        }
        return size >= 2
    }

    private fun greateCommonDivisor(x: Int, y: Int): Int {
        // remainder 0일 떄까지 반복해서 mod 연산
        // 16, 8
        // 8, 4
        // 4, 2
        // 2, 0
        // gcd -> 2
        return if (x == 0) y else greateCommonDivisor(y % x, x)
    }
}

fun main() {
    val solution = Solution()
    val result = solution.hasGroupsSizeX(intArrayOf(5, 5, 5, 5, 1))
    println(result)
}