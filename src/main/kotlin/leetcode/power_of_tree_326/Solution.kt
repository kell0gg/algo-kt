package leetcode.power_of_tree_326

class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        return (n > 0) && (1162261467 % n == 0)
    }
}