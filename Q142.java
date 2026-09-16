public class Q142 {

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
        next = null;
    }
 }
 
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head ;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next ;

            if(fast == slow){
           
     ListNode start = head;
     while(start != slow ){
        slow = slow.next;
        start = start.next;
     }

         return start;
            }
        }
return null ;
    }

}
