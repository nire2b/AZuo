package systemclass.class3;

import org.junit.Test;

public class DoubleList {
    class ListNode{
        public int val;
        public ListNode pre;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode() {
        }
    }

    @Test
    public void testDeleteNode(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next=b;b.next=c;c.next=d;d.next=null;
        d.pre=c;c.pre=b;b.pre=a;a.pre = null;
        ListNode head = a;
        ListNode listNode = deleteNode(head, 1);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
    public static ListNode deleteNode(ListNode head,int var){
        if (head==null){
            return null;
        }
        if (head.val==var){
            return head.next;
        }
        ListNode res =head;
        ListNode pre = null;
        while (head.val!=var){
            pre = head;
            head = head.next;
        }
        if (head ==null){
            return res;
        }
        if (head.next==null){
            pre.next=null;
            return res;
        }
        ListNode next = head.next;
        pre.next=next;
        next.pre=pre;
        return res;
    }

    @Test
    public void testReverseLis(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next=b;b.next=c;c.next=d;d.next=null;
        d.pre=c;c.pre=b;b.pre=a;a.pre = null;
        ListNode head = a;
        ListNode listNode = reverseList(head);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode next = null;
        while (head!=null){
            next = head.next;
            head.next = pre;
            head.pre = next;
            pre = head;
            head = next;
        }
        return pre;
    }
}
