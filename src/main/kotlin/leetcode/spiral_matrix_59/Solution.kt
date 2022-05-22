package leetcode.spiral_matrix_59

import java.util.*


class Solution {
    companion object {
        // 우, 하, 좌, 상 순으로 가야함
        private var DIR_ROW: IntArray = intArrayOf(0, 1, 0, -1)
        private var DIR_COL: IntArray = intArrayOf(1, 0, -1, 0)
    }

    fun generateMatrix(n: Int): Array<IntArray> {
        DIR_ROW = intArrayOf(0, 1, 0, -1)
        DIR_COL = intArrayOf(1, 0, -1, 0)
        return dfs(n)
    }

    private fun dfs(n: Int): Array<IntArray> {
        // n*n, -1로 초기화해서 맵을 생성
        val map: Array<IntArray> = Array(n) { IntArray(n) { -1 } }
        var q: Deque<Node> = ArrayDeque()

        map[0][0] = 1
        q.addLast(Node(0, 0, 0, 1))

        while (!q.isEmpty()) {
            val tmp = q.pollFirst()

            // 일단 가던 방향대로 간다
            var nr = tmp.r + DIR_ROW[tmp.dir]
            var nc = tmp.c + DIR_COL[tmp.dir]

            if (nr >= 0 && nc >= 0 && nr < n && nc < n && map[nr][nc] == -1) {
                var next = tmp.value + 1
                map[nr][nc] = next
                q.addLast(Node(nr, nc, tmp.dir, next))
            } else {
                // 못가면 다른 방향으로 갈 수 있는지 확인해본다
                for (i in 0 until 4) {
                    var nr = tmp.r + DIR_ROW[i]
                    var nc = tmp.c + DIR_COL[i]

                    // 방문하지 않은 노드는 -1로 설정 -> -1이 아니면 추가적으로 진행하지 않음
                    if (nr < 0 || nc < 0 || nr >= n || nc >= n || map[nr][nc] != -1) {
                        continue;
                    }

                    // 접근 가능한 노드 있으면 방문하는데, 어차피 갈 수 있는 곳은 한 군데 밖에 없음
                    var next = tmp.value + 1
                    map[nr][nc] = next
                    q.addLast(Node(nr, nc, i, next))
                    break
                }
            }
        }

        for (i in 0 until n) {
            for (j in 0 until n) {
                print("${map[i][j]}   ")
            }
            println()
        }
        return map
    }
}

data class Node(var r: Int, var c: Int, var dir: Int, var value: Int)