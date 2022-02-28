package distribute_candies_575

class Solution {
    fun distributeCandies(candyType: IntArray): Int {
        // 1. n/2 개만 먹을 수 있을 때,
        // 2. 최대한 먹을 수 있는 캔디의 수

        val set: MutableSet<Int> = HashSet()
        val size = candyType.size / 2
        candyType.forEach { set.add(it) }

        return if (set.size < size) return set.size else size
    }
}