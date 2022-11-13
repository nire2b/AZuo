package baseclass.chapter_02;

public class Random_fixed {
    public static void main(String[] args) {
        int count = 0;
        int testNum = 10000000;
        double a = 1.0/7.0;
        for (int i = 0; i < testNum; i++) {
            if (Fx()==7){
                count++;
            }
        }
        System.out.println(a);
        System.out.println((double) count/(double) testNum);


//        System.out.println((double) count/(double) testNum);
//        System.out.println(XX()/(double) testNum);

    }
    public static double XX(){
        int count = 0;
        int testNum = 10000000;
        for (int i = 0; i < testNum; i++) {
            if (Math.max(Math.random(), Math.random())<0.3){
                count++;
            }
        }
        return (double) count;
    }
    //等概率返回1-5的整数
    public static int fx(){
        return (int)(Math.random()*5)+1;
    }
    //根据上述函数等概率返回0和1
    public static int gx(){
        int temp =0;
        do {
            temp = fx();
        }while (temp==3);
        return temp>3?1:0;
    }
    //根据上述函数利用二进制等概率返回0-6的整数
    public static int hx(){
        int temp = 0;
        do {
            temp = (gx()<<2)+(gx()<<1)+gx();
        }while (temp==7);
        return temp;
    }
    //返回1-7的整数
    public static int Fx(){
        return hx()+1;
    }
}
