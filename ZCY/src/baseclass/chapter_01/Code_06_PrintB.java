package baseclass.chapter_01;

public class Code_06_PrintB {
    public static void main(String[] args) {
        int num = 12345678;

        int a = Integer.MIN_VALUE;
        print(2147483647);
        print(-32767);

    }

    public static void print(int num){
        for (int i=31;i>=0;i--){
            System.out.print((num & ( 1 << i)) == 0 ? "0":"1");
        }
        System.out.println();
    }
}
