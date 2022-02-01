package intersaction_of_two_arrays_350

class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val result: MutableList<Int> = ArrayList()

        nums1.sort()
        nums2.sort()

        var idx1 = 0
        var idx2 = 0

        while (true) {
            if (idx1 >= nums1.size || idx2 >= nums2.size) {
                break
            }
            if (nums1[idx1] == nums2[idx2]) {
                result.add(nums1[idx1])
                idx1++
                idx2++
            } else if (nums1[idx1] < nums2[idx2]) {
                idx1++

            } else if (nums1[idx1] > nums2[idx2]) {
                idx2++

            } else {
                // pass
            }
        }
        return result.toIntArray()
    }
}

fun main(args: Array<String>) {
    // pass
}