package hamming_distance_461

class Solution {
    fun hammingDistance(x: Int, y: Int): Int {
        var tmp = x xor y
        var count = 0

        for (i in 0 until 32) {
            count += (tmp shr i) and 1
        }
        return count
    }
}