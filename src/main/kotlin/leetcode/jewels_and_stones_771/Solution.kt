package leetcode.jewels_and_stones_771

class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val set: MutableSet<Char> = HashSet()
        jewels.forEach { set.add(it) }
        return stones.filter { set.contains(it) }.length
    }
}