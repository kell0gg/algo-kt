package Two_Sum_01

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                val tmp: Int = nums[i] + nums[j]
                if (tmp == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf(-1, -1)
    }
}

//
//class Solution {
//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        for (i in nums.indices) {
//            for (j in i + 1 until nums.size) {
//                val tmp = nums[i] + nums[j]
//                if (tmp == target) {
//                    return intArrayOf(i, j)
//                }
//            }
//        }
//        return intArrayOf(-1, -1)
//    }
// }
fun main(args: Array<String>) {
    print("hello")
}