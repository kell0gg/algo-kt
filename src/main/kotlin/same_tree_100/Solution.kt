package same_tree_100


class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return diff(p, q)
    }

    fun diff(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) {
            return true
        }
        if (p == null || q == null) {
            return false
        }
        if (p!!.`val` == q!!.`val`) {
            return diff(p.left, q.left) && diff(p.right, q.right)
        }
        return false
    }
}