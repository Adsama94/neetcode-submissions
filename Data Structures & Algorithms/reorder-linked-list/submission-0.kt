/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
        if (head?.next == null) {
            return
        }

        // finding the middle of the list first
        var slow = head
        var fast = head
        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        // reverse the second half of the list
        var prev: ListNode? = null
        var current = slow?.next
        while (current != null) {
            val next = current.next
            current.next = prev
            prev = current
            current = next
        }
        slow?.next = null

        // merge the two halves of list
        var p1 = head
        var p2 = prev
        while (p2 != null) {
            val next1 = p1?.next
            val next2 = p2?.next
            p1?.next = p2
            p2.next = next1
            p1 = next1
            p2 = next2
        }
    }
}
