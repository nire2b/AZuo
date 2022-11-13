package systemclass.class3;

import org.junit.Test;

public class ArrayToQueueAndStack {
    public static void main(String[] args) {

    }

    @Test
    public void testAQ(){
        int[] arr = new int[5];
        Aqueue aqueue = new Aqueue(arr);
        aqueue.addNum(1);
        aqueue.addNum(2);
        aqueue.addNum(3);
        aqueue.addNum(4);
        aqueue.addNum(5);
        System.out.println("aqueue.begin = " + aqueue.begin);
        System.out.println("aqueue.end = " + aqueue.end);
        aqueue.getNum();
        aqueue.getNum();
        aqueue.getNum();
        aqueue.getNum();
        aqueue.getNum();
        System.out.println("aqueue.begin = " + aqueue.begin);
        System.out.println("aqueue.end = " + aqueue.end);
    }

    class Aqueue{
        int begin=0;
        int end=0;
        int[] arr;

        public Aqueue(int[] arr) {
            this.arr = arr;
        }

        public int getNum(){
            if (arr==null||arr.length==0){
                return -1;
            }
            if (begin>=arr.length){
                return -1;
            }

            return arr[begin++];
        }

        public void addNum(int num){
            if (end == arr.length){
                if (begin!=0){
                    end=0;
                    arr[end++]=num;
                }
            }
            arr[end++] = num;
        }
    }


}

