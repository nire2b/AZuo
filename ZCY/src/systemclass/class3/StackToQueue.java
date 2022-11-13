package systemclass.class3;

public class StackToQueue {

}
    class MyQueue {
        public int[] stack1;
        public int[] stack2;
        public int start;
        public int end;
        public int size;
        public MyQueue() {
            stack1 = new int[1000];
            start = 0;
            end = 0;
            size=0;
        }

        public void push(int x) {
            if (size>1000){
                return;
            }
            if (end==stack1.length){
                if (start!=0){
                    end=0;
                    stack1[end++]=x;
                    size++;
                    return;
                }else {
                    return;
                }
            }
            stack1[end++]=x;
            size++;
        }

        public int pop() {
            if (start==stack1.length-1&&size<=1000){
                int res = stack1[start];
                start = 0;
                size--;
                return res;
            }
            size--;
            return stack1[start++];
        }

        public int peek() {
            return stack1[start];
        }

        public boolean empty() {
            if (size==0){
                return true;
            }else {
                return false;
            }
        }
}
