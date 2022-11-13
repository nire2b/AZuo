package systemclass.class09;

import systemclass.class09.structure.ListNode;

public class ReorderList {
    public static void main(String[] args) {

    }
    public static void reorderList(ListNode head){
        if (head==null||head.next==null||head.next.next==null){
            return;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        ListNode pre = head;
        //如果是奇数，slow就是中点，如果是偶数，slow就是下中点
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            pre = pre.next;
        }
        pre.next = null;
        ListNode rightHead = null;
        ListNode next = null;
        while (slow!=null){
            next = slow.next;
            slow.next = rightHead;
            rightHead = slow;
            slow = next;
        }
        ListNode leftHead = head;
        ListNode temp1 = null;
        ListNode temp2 = null;
        while (leftHead!=null){
            temp1 = leftHead.next;
            temp2 = rightHead.next;
            leftHead.next = rightHead;
            if (temp1==null){
                break;
            }
            rightHead.next = temp1;
            leftHead = temp1;
            rightHead = temp2;
        }
    }
}
