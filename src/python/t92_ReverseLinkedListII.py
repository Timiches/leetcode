def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
    if right == 1:
        return head
    dummy = ListNode()
    l: ListNode = dummy
    r: ListNode
    dummy.next = head

    for i in range(0, left - 1):
        l = l.next
    r = l.next
    for i in range(left, right):
        rev: ListNode = r.next
        r.next = rev.next
        rev.next = l.next
        l.next = rev
    return dummy.next
