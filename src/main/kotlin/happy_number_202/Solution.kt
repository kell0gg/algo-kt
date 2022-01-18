package happy_number_202


class Solution {
    fun isHappy(n: Int): Boolean {
        var tmp = n
        val set: MutableSet<Int> = HashSet()

        var squareSum: Int
        var remain: Int

        while (set.add(tmp)) {
            squareSum = 0
            while (tmp > 0) {
                remain = tmp % 10
                squareSum += remain * remain
                tmp /= 10
            }
            if (squareSum == 1) return true
            else tmp = squareSum
        }
        return false
    }
}