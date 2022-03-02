package leetcode.can_place_flowers_605

class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        // edge case
        // 1. 좌우에 꽃이 없어야 함
        // 2. -1, +1만 비교하면 됨

        var count = 0
        var tmp = flowerbed.clone()
        for (i in flowerbed.indices) {
            if (flowerbed[i] == 0) {
                var prev = if (i == 0) 0 else tmp[i - 1]
                var next = if (i == flowerbed.size - 1) 0 else tmp[i + 1]

                if (prev == 0 && next == 0) {
                    tmp[i] = 1
                    count++
                }
            }
        }

        return n <= count
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.canPlaceFlowers(intArrayOf(0), 1)
    println(result)
}