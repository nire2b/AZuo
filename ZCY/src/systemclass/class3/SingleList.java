package systemclass.class3;

import baseclass.chapter_04.ListNode;
import org.junit.Test;

import java.util.TreeMap;

public class SingleList {
    static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

    }

    @Test
    public void testReverseNode(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        Node head = a;
        Node node = reverseNode(a);
        while (node!=null){
            System.out.println(node.value);
            node=node.next;
        }
    }

    public static Node reverseNode(Node head){
        Node pre = null;
        Node next = null;
        while (head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public ListNode deleteNode(ListNode head, int val) {
        if (head==null){
            return null;
        }
        if (head.val==val){
            return head.next;
        }
        ListNode cur = head;
        ListNode pre = null;
        while (head.val!=val){
            pre = head;
            head=head.next;
        }
        if (head.next!=null){
            pre.next = head.next;
            return cur;
        }
        pre.next=null;
        return cur;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null){
            return null;
        }
        int i = 0;
        ListNode res = head;
        TreeMap<Integer, ListNode> map = new TreeMap<>();
        while (head!=null){
            map.put(++i, head);
            head=head.next;
        }
        if (i-n==0){
            return res.next;
        }
        ListNode N = map.get(i-n+1);

        ListNode preN = map.get(i-n);
        if (i-n+1==i){
            preN.next=null;
            return res;
        }
        ListNode nextN = map.get(i-n+2);
        preN.next=nextN;
        return res;
    }
}
