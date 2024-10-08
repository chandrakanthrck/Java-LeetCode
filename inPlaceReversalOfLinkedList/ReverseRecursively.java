package inPlaceReversalOfLinkedList;

public class ReverseRecursively {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode reversedList = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversedList;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        ReverseRecursively obj = new ReverseRecursively();
        ListNode result = obj.reverseList(head);
        
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
