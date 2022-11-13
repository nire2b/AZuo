package systemclass.class2;

public class GetRightOne {
    public static void main(String[] args) {
        int a = 1024;
        int rightOne = 0;
        rightOne = a & -a;
        System.out.println(rightOne);
    }
}
