package main.october.week2

import main.ListNode

/**
 * Given the head of a linked list, return the list after sorting it in ascending order.

Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?
Example 1:

Input: head = [4,2,1,3]
Output: [1,2,3,4]
--------------------------------------------------
 * Example 2:
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]
----------------------------------------------------
Example 3:

Input: head = []
Output: []
 */
fun sortList(head: ListNode?): ListNode? {
    if (head?.next == null)
        return head
    var preSlow: ListNode? = null
    var slow: ListNode? = head
    var fast: ListNode? = head

    while (fast?.next != null) {
        preSlow = slow
        slow = slow?.next
        fast = fast.next?.next
    }
    preSlow?.next = null
    return mergeTwoList(sortList(head), sortList(slow))
}

fun mergeTwoList(list1: ListNode?, list2: ListNode?): ListNode? {
    var l1 = list1
    var l2 = list2
    val temp: ListNode? = ListNode(-1)
    var current = temp
    while (l1 != null && l2 != null) {
        if (l1.`val` < l2.`val`) {
            current?.next = l1
            l1 = l1.next
        } else {
            current?.next = l2
            l2 = l2.next
        }
        current = current?.next
    }
    current?.next = l1 ?: l2
    return temp?.next
}