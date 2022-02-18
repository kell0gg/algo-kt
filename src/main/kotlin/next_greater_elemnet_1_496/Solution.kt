package next_greater_elemnet_1_496

import java.util.*
import kotlin.collections.HashMap

class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        // stack을 사용해서 증가하는 값을 구하고,
        // map을 사용해서 인덱스를 계속 저장

        val map: MutableMap<Int, Int> = HashMap()
        val stack: Stack<Int> = Stack()

        for (num in nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map[stack.pop()] = num
            }
            stack.push(num)
        }

        var arr: Array<Int> = Array(nums1.size) { 0 }

        for (i in arr.indices) {
            arr[i] = map.getOrDefault(nums1[i], -1)
        }
        return arr.toIntArray()
    }
}