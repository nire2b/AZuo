package systemclass.class09;

import systemclass.class09.structure.ListNode;

public class IsPalindrome {
    public static void main(String[] args) {
        ListNode test = null;
        test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(2);
        test.next.next.next = new ListNode(1);
//        test.next.next.next.next = new ListNode(4);
//        test.next.next.next.next.next = new ListNode(5);
//        test.next.next.next.next.next.next = new ListNode(6);
//        test.next.next.next.next.next.next.next = new ListNode(7);
//        test.next.next.next.next.next.next.next.next = new ListNode(8);
        boolean palindrome = isPalindrome(test);
        System.out.println(palindrome);
    }
    public static boolean isPalindrome(ListNode head){
        if (head==null){
            return false;
        }
        if (head.next==null){
            return true;
        }
        if (head.next.next==null){
            return head.val==head.next.val;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode RH = null;
        ListNode temp = null;
        while (slow!=null){
            temp = slow.next;
            slow.next=RH;
            RH = slow;
            slow = temp;
        }
        ListNode LR = head;
        while (LR.next!=null){
            if (LR.val!=RH.val){
                return false;
            }
            LR = LR.next;
            RH = RH.next;
        }
        return true;
    }
}
