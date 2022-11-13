package baseclass.chapter_02;

import baseclass.chapter_01.ArrayUtils;

public class SumPreArray {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(selectSum(a,0,2));
    }

    public static int[] sumArray(int[] arr){
        if (arr ==null||arr.length<1){
            return null;
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i] =arr[i] + arr[i-1];
        }
        return arr;
    }

    public static int selectSum(int[] arr ,int start ,int end){
        if (arr ==null||arr.length<1){
            return 0;
        }
        int[] temp = new int[arr.length];
        ArrayUtils.copy(arr, temp);
        temp = sumArray(temp);
        if (start==0){
            return temp[end];
        }
        return temp[end]-temp[start-1];
    }
}
