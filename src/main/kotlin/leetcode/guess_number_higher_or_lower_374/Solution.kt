package leetcode.guess_number_higher_or_lower_374

fun guess(num: Int): Int {
    return 0
}

class Solution{
    fun guessNumber(n: Int): Int {
        var l = 0
        var r = n

        while (l < r) {
            var m = l + ((r - l) / 2)
            if (guess(m) == 0) {
                return m
            } else if (guess(m) == -1) {
                r = m - 1
            } else {
                l = m + 1
            }
        }
        return l
    }
}