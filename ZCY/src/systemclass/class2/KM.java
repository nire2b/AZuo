package systemclass.class2;

public class KM {
    public static void main(String[] args) {
        int[] ints = randomArr(100, 1000, 5, 8);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+" ");
        }
        System.out.println();
        int k = getK(ints, 5, 8);

        System.out.println("k = " + k);
    }
    public static int getK(int[] arr , int K,int M){
        int[] bin= new int[32];
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int total = 0;
            for(int nums:arr){
                total += nums>>i&1;
            }
            if (total%M!=0){
                res |= 1<<i;
            }
        }
        return res;
    }

    public static int[] randomArr(int max,int len,int k,int m){
        int Len = (int)(Math.random()*len);
        int Len1 = Len*m + k;
        int[] arr = new int[Len1];
        int numK = (int)(Math.random()*max);
        int i = 0;
        for (i = 0; i < k; i++) {
            arr[i] = numK;
        }
        int numM = (int)(Math.random()*max)+1;
        while (i<Len1){
            while (numM==1||numM<=numK){
                numM = (int)(Math.random()*max)+1;
            }
            for (int j = 0; j < m; j++) {
                arr[i++] = numM;
            }
            numM = 1;
        }
        return arr;
    }
}
