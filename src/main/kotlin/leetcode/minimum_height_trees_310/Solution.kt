package leetcode.minimum_height_trees_310

class Solution {
    fun findMinHeightTrees(n: Int, edges: Array<IntArray>): List<Int> {
        // # 연결된 수가 가장 많은 노드를 루트로 잡았을 때 -> 높이가 최소가 됨

        // edge case
        if(n==0) return ArrayList<Int>()
        if(n==1) return arrayListOf<Int>(0)

        // 1. 0~n index 를 가지고 node 생성
        var lists: MutableList<MutableList<Int>> = ArrayList()
        for (i in 0 until n) {
            lists.add(ArrayList())
        }

        // 2. edge 연결
        for (i in edges.indices) {
            val v1 = edges[i][0]
            val v2 = edges[i][1]
            lists[v1].add(v2)
            lists[v2].add(v1)
        }

        // 연결된 노드가 하나인(leaf node)를 찾기
        var leaves: MutableList<Int> = ArrayList()
        for (i in 0 until n) {
            if (lists[i].size == 1) {
                leaves.add(i)
            }
        }

        var count = n
        // node가 두 개만 남을 때까지 반복적으로 수행

        while(count > 2){
            val size = leaves.size
            count -= size

            val tmpLeaves: MutableList<Int> = ArrayList()

            for(i in 0 until leaves.size){
                val leaf = leaves[i]

                // 노드를 순회하면서 leaf node를 제거
                for(j in 0 until lists[leaf].size){
                    val tobeDeleted = lists[leaf][j]
                    lists[tobeDeleted].remove(leaf)

                    if(lists[tobeDeleted].size==1){
                        tmpLeaves.add(tobeDeleted)
                    }
                }
            }
            leaves = tmpLeaves
        }
        return leaves
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.findMinHeightTrees(4, arrayOf(intArrayOf(1,0),intArrayOf(1,2),intArrayOf(1,3)))
    for(i in result){
        println(i)
    }
}