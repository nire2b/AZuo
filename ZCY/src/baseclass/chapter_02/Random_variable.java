package baseclass.chapter_02;

import org.junit.Test;

public class Random_variable {
    //从a-b随机到c-d
    public static void main(String[] args) {
        int count = 0;
        int testNum = 10000000;
        for (int i = 0; i < testNum; i++) {
            if (hx(6, 100,7,8) == 7) {
                count++;
            }
        }
        System.out.println((double) count / (double) testNum);
    }
    //等概率返回a-b的整数
    public static int fx(int a, int b) {
        return (int) (Math.random() * (b - a + 1) + a);
    }
    //根据上述函数等概率返回0和1
    public static int gx(int a, int b) {
        int temp = 0;
        double num = (b - a + 1) / 2.0;
        int half = (a + b) / 2;
        if (num % 1 == 0) {
            temp = fx(a, b);
            return temp <= (a + b) / 2 ? 0 : 1;
        } else {
            do {
                temp = fx(a, b);
            } while (temp == (a + b) / 2);
            return temp < (a + b) / 2 ? 0 : 1;
        }
    }
    //根据上述函数利用二进制等概率返回c-d的整数
    public static int hx(int a,int b,int c,int d) {
        //得到数字是几位的
        int count = 1;
        int tempD = d;
        while (tempD/2!=0){
            tempD/=2;
            count++;
        }

        int num = 0;
        do {
            num = getNum(a,b , count);
        }while (num<c||num>d);
        return num;
    }

    public static int getNum(int a,int b,int count){
        int temp = 0;
        for (int i = count-1; i >=0 ; i--) {
            temp = temp + (gx(a,b)<<i);
        }
        return temp;
    }
    @Test
    public void test01() {

        int count = 0;
        int testNum = 10000000;
        for (int i = 0; i < testNum; i++) {
            if (getNum(2, 5, 3) == 1) {
                count++;
            }
        }
        System.out.println((double) count / (double) testNum);
    }
}
