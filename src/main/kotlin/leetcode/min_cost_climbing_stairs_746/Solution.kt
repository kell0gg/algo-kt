package leetcode.min_cost_climbing_stairs_746

class Solution {
    companion object {
        var map: MutableMap<Int, Int> = HashMap()
    }

    fun minCostClimbingStairs(cost: IntArray): Int {
        map = HashMap()

        return dfs(cost, -1)
    }

    private fun dfs(cost: IntArray, depth: Int): Int {
        if (depth >= cost.size) {
            return 0
        }

        if (map.containsKey(depth)) {
            // 해당 지점에 대한 결과가 존재한다면,
            // -> map.get(depth), !! -> null이면 NPE
            return map[depth]!!
        }

        val step1 = dfs(cost, depth + 1)
        val step2 = dfs(cost, depth + 2)

        map[depth] = kotlin.math.min(step1, step2) + if (depth == -1) 0 else cost[depth]

        return map[depth]!!
    }


/* Time Limit Exceeded
    private fun dfsUtil(cost: IntArray) {
        // 1 step
        dfs(cost, 0, 0)

        // 2 step
        dfs(cost, 1, 0)
    }

    private fun dfs(cost: IntArray, depth: Int, sum: Int) {
        if (depth >= cost.size) {
            min = kotlin.math.min(min, sum)
            return
        }

        if (depth == (cost.size - 1)) {
            min = kotlin.math.min(min, sum)
        }

        dfs(cost, depth + 1, sum + cost[depth])
        dfs(cost, depth + 2, sum + cost[depth])
    }*/
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.minCostClimbingStairs(intArrayOf(10, 15, 20))
    println(result)
}