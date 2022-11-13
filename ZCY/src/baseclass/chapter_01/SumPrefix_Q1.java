package baseclass.chapter_01;

public class SumPrefix_Q1 {
    public static void main(String[] args) {
        System.out.println(sumFactorial(6  ));
        System.out.println(sumPrefix(6));
    }

    //1.先算出阶乘
    public static int factorial(int num){
        int temp = 1;
        if (num <=0){
            return num;
        }
        for (int i = 1;i<=num;i++){
            temp = i *temp;
        }
        return temp;
    }
    //2.阶乘累加
    public static int sumFactorial(int num){
        int temp = 0;
        for (int i=1;i<=num;i++){
            temp += factorial(i);
        }
        return temp;
    }
    //3.将上述两个方程合二为一，一步实现，少调用n次for循环：
    public static int sumPrefix(int num){
        int sum = 0;
        int mul = 1;
        for (int i =1;i<=num;i++){
            mul = mul *i;
            sum +=mul;
        }
        return sum;
    }

}
