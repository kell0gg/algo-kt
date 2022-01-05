package remove_element_27

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var idx: Int = 0
        nums.forEach {
            if(it!=`val`) nums[idx++] = it
        }
        return idx
    }
}