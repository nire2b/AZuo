package systemclass.class3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueToStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.top());
        myStack.pop();
        System.out.println(myStack.top());
        myStack.pop();
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
        myStack.pop();
        System.out.println(myStack.empty());
    }
    static class MyStack {
        public Queue<Integer> queue1;
        public Queue<Integer> queue2;
        public Queue<Integer> temp;
        int size;
        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
            size = 0;
        }

        public void push(int x) {
            queue1.add(x);
            size++;
        }

        public int pop() {
            int i = size;
            while (i!=1){
                queue2.offer(queue1.poll());
                i--;
            }
            int res = queue1.poll();
            temp=queue1;
            queue1 = queue2;
            queue2 = temp;
            size--;
            return res;
        }

        public int top() {
            int i = size;
            while (i!=1){
                queue2.offer(queue1.poll());
                i--;
            }
            int res = queue1.poll();
            queue2.add(res);
            queue1 = queue2;
            queue2 = temp;
            return res;
        }

        public boolean empty() {
            if (size==0){
                return true;
            }else {
                return false;
            }
        }
    }
}
