package leetcode.peak_index_in_a_mountain_array_852

class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var left = 0
        var right = arr.size - 1

        // 0 1 2 3 4  5 6 7 8 9
        // 1 2 3 4 10 9 8 7 6 5
        // left = 0 right = 9
        // step 1 -> mid = 4
        // mid[4] = 10, mid[5] = 9 -> right = 4
        // left = 0, right = 4
        // left = 2 + 1 = 3
        // left = 3 + 1

        while (left < right) {
            var mid = left + (right - left) / 2
            if (arr[mid] > arr[mid + 1]) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left
    }
}

fun main() {
    val solution = Solution()
    val result = solution.peakIndexInMountainArray(intArrayOf(0, 1, 0))
    println(result)
}