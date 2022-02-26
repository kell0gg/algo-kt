package serialize_and_deserialize_binary_tree_297

import java.util.*

/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Codec() {
// serailize 하면?
// 1, 2, #, #, 3, 4, #, #, 5, #, #

// deserilize 하면?
// root -> 1
// root.left -> 2
// root.left.left -> null
// root.left.right -> null
// root.right -> 3
// root.right.left -> 4
// root.right.left.left = null
// root.right.left.right = null
// root.right.right -> 5
// ..

    // Encodes a URL to a shortened URL.
    fun serialize(root: TreeNode?): String {
        return serializeUtil(StringBuilder(), root).toString()
    }

    private fun serializeUtil(sb: StringBuilder, root: TreeNode?): StringBuilder {
        if (root == null) return sb.append("#")
        sb.append(root.`val`).append(",")
        serializeUtil(sb, root.left).append(",")
        serializeUtil(sb, root.right)
        return sb
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        val q: Deque<String> = ArrayDeque()
        data.split(",").forEach { q.addLast(it) }
        return deserializeUtil(q)
    }

    private fun deserializeUtil(q: Deque<String>): TreeNode? {
        val `val` = q.poll()

        // kotlin은 `==` 을 하면 내부적으로 equal을 수행하기는 하지만, 좀 더 명시적으로 객체 비교를 나타내기 위해
        if (`val`.equals("#") || `val`.isNullOrEmpty()) return null

        val root: TreeNode = TreeNode(`val`.toInt())
        root.left = deserializeUtil(q)
        root.right = deserializeUtil(q)
        return root
    }
}

/**
 * Your Codec object will be instantiated and called as such:
 * var ser = Codec()
 * var deser = Codec()
 * var data = ser.serialize(longUrl)
 * var ans = deser.deserialize(data)
 */

