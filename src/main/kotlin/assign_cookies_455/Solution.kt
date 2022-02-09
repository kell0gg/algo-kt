package assign_cookies_455

class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        var gs = g.sorted()
        var ss = s.sorted()

        var gidx = 0
        var sidx = 0

        var count = 0

        while (gidx < gs.size && sidx < ss.size) {
            if (gs[gidx] < ss[sidx]) {
                count++
                gidx++
                sidx++
            } else if (gs[gidx] > ss[sidx]) {
                sidx++
            } else {
                gidx++
            }
        }
        return count
    }
}