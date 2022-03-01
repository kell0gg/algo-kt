package leetcode.merge_sorted_array_88

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var tail1 = m - 1
        var tail2 = n - 1
        var index = tail1 + tail2 + 1

        while (tail1 >= 0 && tail2 >= 0) {
            nums1[index--] = if (nums1[tail1] > nums2[tail2]) {
                nums1[tail1--]
            } else {
                nums2[tail2--]
            }
        }

        while (tail2 >= 0) {
            nums1[index--] = nums2[tail2--]
        }
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2 = intArrayOf(2, 2, 3)
    solution.merge(nums1, 3, nums2, 3)
}
