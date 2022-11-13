package baseclass.chapter_04;

public class ListNode {
     public int val;
     public ListNode next;
     public ListNode() {
     }
     public ListNode(int val) {
         this.val = val;
     }
     public ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }
     class Solution {
         public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
             ListNode curL = listLength(l1)>=listLength(l2)?l1:l2;
             ListNode curS = listLength(l1)<listLength(l2)?l1:l2;
             ListNode l = curL;
             ListNode s = curS;
             ListNode last = null;
             int curNum = 0;
             int carryNum = 0;
             while (s!=null){
                 curNum = l.val+s.val+carryNum;
                 l.val = curNum %10;
                 carryNum=curNum/10;
                 last = l;
                 l = l.next;
                 s = s.next;

             }
             while (l!=null){
                 curNum = l.val + carryNum;
                 l.val = curNum%10;
                 carryNum = curNum/10;
                 last = l;
                 l = l.next;
             }
             if (carryNum != 0){
                 ListNode node = new ListNode(1);
                 last.next = node;
             }

             return curL;
         }

         public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
             if (list1==null||list2==null){
                 return list1 ==null?list2:list1;
             }
             ListNode head = list1.val<=list2.val?list1:list2;
             ListNode cur = head;
             ListNode l1 = head.next;
             ListNode l2 = head == list1?list2:list1;
             while (l1!=null&&l2!=null){
                 if (l1.val<=l2.val){
                     cur.next=l1;
                     cur = l1;
                     l1 = l1.next;
                 }else {
                     cur.next = l2;
                     cur = l2;
                     l2 = l2.next;
                 }
             }
             if (l1==null){
                 cur.next=l2;
             }else {
                 cur.next = l1;
             }
             return head;
         }

         public ListNode reverseKGroup(ListNode head, int k) {

             ListNode start = head;
             ListNode end = getK(start, k);
             if (end==null){
                return start;
             }
             head = end;
             reverse(start, end);
             ListNode lastEnd = start;
             while (lastEnd.next!=null){
                 lastEnd = start.next;
                 end = getK(lastEnd, k);
                 if (end==null){
                     break;
                 }
                 reverse(lastEnd,end);
                 start.next=end;
                 start = lastEnd;
             }
            return head;
         }

         public ListNode getK(ListNode start,int k){
             while (--k!=0&&start!=null){
                 start = start.next;
             }
             return start;
         }

         public ListNode reverse(ListNode start,ListNode end){
             end = end.next;
             ListNode cur = start;
             ListNode next = null;
             ListNode pre = null;
             while (cur!=end){
                next = cur.next;
                cur.next = pre;
                pre=cur;
                cur=next;
             }
             start.next=end;
             return pre;
         }
     }

     public int listLength(ListNode head){
         int size = 0;
         while (head!=null){
             head = head.next;
             size++;
         }
         return size;
     }
 }

