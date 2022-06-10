package leetcode.largest_perimeter_triangle_976

class Solution {
    fun largestPerimeter(nums: IntArray): Int {
        // 1. 가장 두 개를 구함 -> a1, a2
        // 2. a1 > a2 + a3 을 만족하는 a3이 나올 때까지 반복
        val sortedNums = nums.sortedArrayDescending()
        if (sortedNums.size < 3) return 0

//        for (i in sortedNums.indices) {
//            if (sortedNums.size - i < 3) return 0
//            val a1 = sortedNums[i]
//            val a2 = sortedNums[i + 1]
//            for (j in (i + 2) until sortedNums.size) {
//                if (sortedNums[j] + a2 > a1) {
//                    return a1 + a2 + sortedNums[j]
//                }
//            }
//        }

        // O(N) 으로 해도 동일함 어차피 세 개의 값만 찾으면 되니까
        for (i in 0 until sortedNums.size - 2) {
            if(sortedNums[i] < sortedNums[i+1] + sortedNums[i+2]){
                return sortedNums[i] + sortedNums[i+1] + sortedNums[i+2]
            }

        }
        return 0
    }
}

fun main() {
    val solution = Solution()
    val result = solution.largestPerimeter(intArrayOf(3, 6, 2, 3))
    println("result ${result}")

}