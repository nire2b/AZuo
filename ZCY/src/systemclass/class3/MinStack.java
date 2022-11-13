package systemclass.class3;

import org.junit.Test;

import java.util.Stack;

public class MinStack {
    public int[] value;
    public int[] minV;
    public int num=0;
    public int min;

    public MinStack() {
        value = new int[3*10*10*10*10+1];
        minV = new int[3*10*10*10*10+1];
    }

    public void push(int val){
        if (num==0){
            value[num]=val;
            minV[num] = val;
            min = val;
            num++;
            return;
        }
        value[num]=val;
        min = Math.min(min, val);
        minV[num]= min;
        num++;
    }

    public int getMin(){
        return minV[num];
    }
    public int top() {
        return value[num];
    }
    public void pop(){
        if (num==0){
            value = new int[3*10*10*10*10+1];
            minV = new int[3*10*10*10*10+1];
        }
        num--;
        min = minV[num-1];
    }

    @Test
    public void test01(){
        int a = -2147483648;
        MinStack minStack = new MinStack();
        minStack.push(-10);
        minStack.push(14);
        minStack.getMin();
        minStack.getMin();
        minStack.push(-20);
        minStack.getMin();
        minStack.getMin();
        minStack.top();
        minStack.getMin();
        minStack.pop();
        minStack.push(10);
        minStack.push(-7);
        minStack.getMin();
        minStack.push(-7);
        minStack.pop();
        minStack.top();
        minStack.getMin();
        minStack.pop();



    }
}
