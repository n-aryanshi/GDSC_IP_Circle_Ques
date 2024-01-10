class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode curr=slow;
        ListNode prev=null;
        ListNode nxt; 
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        ListNode rightHead=prev;
        ListNode leftHead=head;

        while(rightHead!=null){
            if(leftHead.val!=rightHead.val){
                return false;
            }leftHead=leftHead.next;
            rightHead=rightHead.next;
        }
        return true;
    }
}
