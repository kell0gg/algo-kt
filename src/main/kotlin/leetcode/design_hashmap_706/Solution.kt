package leetcode.design_hashmap_706


class MyHashMap() {
    private val nodes: Array<ListNode?> = arrayOfNulls<ListNode>(10000)

    fun put(key: Int, value: Int) {
        var i = idx(key)
        if (nodes[i] == null) {
            nodes[i] = ListNode(-1, -1)
        }

        val prev = find(nodes[i], key)

        // bucket 내에 key가 존재하면,
        if (prev!!.next == null) {
            prev.next = ListNode(key, value)
        } else {
            prev.next!!.`val` = value
        }
    }

    fun get(key: Int): Int {
        val i = idx(key)
        if (nodes[i] == null) return -1
        val node = find(nodes[i], key)
        return if (node!!.next == null) -1 else node!!.next!!.`val`
    }

    fun remove(key: Int) {
        val i = idx(key)
        if (nodes[i] == null) return
        val prev = find(nodes[i], key)
        if (prev!!.next == null) return
        prev!!.next = prev!!.next!!.next
    }

    fun idx(key: Int): Int {
        return key.hashCode() % nodes.size
    }

    fun find(bucket: ListNode?, key: Int): ListNode? {
        var node = bucket
        var prev: ListNode? = null
        while (node != null && node.key != key) {
            prev = node
            node = node.next
        }
        return prev
    }

    class ListNode(var key: Int, var `val`: Int) {
        var next: ListNode? = null
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */

class Solution {
    // pass
}