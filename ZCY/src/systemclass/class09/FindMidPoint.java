package systemclass.class09;

import java.util.ArrayList;

public class FindMidPoint {
    static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node() {
        }
    }
    //输入链表头节点，奇数长度返回中点，偶数长度返回上中点
    public static Node method1(Node head){
        if (head==null||head.next==null){
            return head;
        }
        Node fast = head.next.next;
        Node slow = head.next;
        while (fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

//  2）输入链表头节点，奇数长度返回中点，偶数长度返回下中点
    public static Node method2(Node head){
        if (head==null||head.next==null){
            return head;
        }
        Node fast = head;
        Node slow = head;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

//3）输入链表头节点，奇数长度返回中点前一个，偶数长度返回上中点前一个
    public static Node method3(Node head){
         if (head==null||head.next==null||head.next.next==null){
             return null;
         }
         Node pre = head;
         Node slow = head.next;
         Node fast = head.next.next;
         while (fast.next!=null&&fast.next.next!=null){
             slow = slow.next;
             fast=fast.next.next;
             pre = pre.next;
         }
         return pre;
    }

//4）输入链表头节点，奇数长度返回中点前一个，偶数长度返回下中点前一个
    public static Node method4(Node head){
        if (head==null||head.next==null||head.next.next==null){
            return head;
        }
        Node pre = head;
        Node fast = head.next.next;
        Node slow = head.next;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            pre = pre.next;
        }
        return pre;
    }

    public static Node right1(Node head) {
        if (head == null) {
            return null;
        }
        Node cur = head;
        ArrayList<Node> arr = new ArrayList<>();
        while (cur != null) {
            arr.add(cur);
            cur = cur.next;
        }
        return arr.get((arr.size() - 1) / 2);
    }

    public static Node right2(Node head) {
        if (head == null) {
            return null;
        }
        Node cur = head;
        ArrayList<Node> arr = new ArrayList<>();
        while (cur != null) {
            arr.add(cur);
            cur = cur.next;
        }
        return arr.get(arr.size() / 2);
    }

    public static Node right3(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }
        Node cur = head;
        ArrayList<Node> arr = new ArrayList<>();
        while (cur != null) {
            arr.add(cur);
            cur = cur.next;
        }
        return arr.get((arr.size() - 3) / 2);
    }

    public static Node right4(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node cur = head;
        ArrayList<Node> arr = new ArrayList<>();
        while (cur != null) {
            arr.add(cur);
            cur = cur.next;
        }
        return arr.get((arr.size() - 2) / 2);
    }

    public static void main(String[] args) {
        Node test = null;
        test = new Node(0);
        test.next = new Node(1);
        test.next.next = new Node(2);
        test.next.next.next = new Node(3);
        test.next.next.next.next = new Node(4);
        test.next.next.next.next.next = new Node(5);
        test.next.next.next.next.next.next = new Node(6);
        test.next.next.next.next.next.next.next = new Node(7);
        test.next.next.next.next.next.next.next.next = new Node(8);

        Node ans1 = null;
        Node ans2 = null;

//        ans1 = method1(test);
//        ans2 = right1(test);
//        System.out.println(ans1 != null ? ans1.value : "无");
//        System.out.println(ans2 != null ? ans2.value : "无");
//
//        ans1 = method2(test);
//        ans2 = right2(test);
//        System.out.println(ans1 != null ? ans1.value : "无");
//        System.out.println(ans2 != null ? ans2.value : "无");

        ans1 = method3(test);
        ans2 = right3(test);
        System.out.println(ans1 != null ? ans1.value : "无");
        System.out.println(ans2 != null ? ans2.value : "无");
//
//        ans1 = method4(test);
//        ans2 = right4(test);
//        System.out.println(ans1 != null ? ans1.value : "无");
//        System.out.println(ans2 != null ? ans2.value : "无");

    }

}
