package baseclass.chapter_05;

public class BitMapAddAndMinus {
    public static void main(String[] args) {
        int a = 10;
        int b = 120;
        System.out.println(a-b);
        System.out.println(minus(a,b));
    }

    public static int add(int a,int b){
        int sum = a;
        while (b!=0){
            sum = a^b;
            b = (a&b)<<1;
            a = sum;
        }
        return sum;
    }

    public static int minus(int a,int b){
        return add(a, add(~b, 1));
    }
}
