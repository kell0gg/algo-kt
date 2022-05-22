package leetcode.flood_fill_733

import java.util.*

fun main() {
    val solution = Solution()
    // [1,1,1],[1,1,0],[1,0,1]
    val image: Array<IntArray> = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 1))
    val result = solution.floodFill(image, 1, 1, 2)

    for (i in result.indices) {
        for (j in result[i].indices) {
            print("${result[i][j]} ")
        }
        println()
    }
}

class Solution {
    companion object {
        // 상, 하, 좌, 우
        private var DIR_ROW: IntArray = intArrayOf(-1, 1, 0, 0)
        private var DIR_COL: IntArray = intArrayOf(0, 0, -1, 1)
    }

    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        // 1. 시작점에서 주변에 같은 색(이어지는 친구들)을 모두 찾음
        // 2. 바꿈
        // 3. dfs, bfs 모두 가능

        DIR_ROW = intArrayOf(0, 1, 0, -1)
        DIR_COL = intArrayOf(1, 0, -1, 0)

        val r = image.size
        val c = image[0].size

        val map: Array<IntArray> = Array(r) { IntArray(c) { 0 } }
        val visited: Array<BooleanArray> = Array(r) { BooleanArray(c) { false } }


        for (i in image.indices) {
            for (j in image[i].indices) {
                map[i][j] = image[i][j]
            }
        }

        val color = image[sr][sc]
        val deque: Deque<Node> = ArrayDeque()
        visited[sr][sc] = true
        map[sr][sc] = newColor
        deque.add(Node(sr, sc))
        while (!deque.isEmpty()) {
            val currentPoint = deque.pollFirst()

            for (i in 0 until 4) {
                val nr = currentPoint.r + DIR_ROW[i]
                val nc = currentPoint.c + DIR_COL[i]

                if (nr < 0 || nc < 0 || nr >= r || nc >= c || visited[nr][nc]) {
                    continue
                }

                if (image[nr][nc] == color) {
                    visited[nr][nc] = true
                    map[nr][nc] = newColor
                    deque.addLast(Node(nr, nc))
                }
            }
        }
        return map
    }
}

data class Node(val r: Int, val c: Int)
