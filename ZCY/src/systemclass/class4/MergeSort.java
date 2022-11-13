package systemclass.class4;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr1 = new int[]{5,6,9,5,6,5,4,2,3,45,78,3,2,6,3,7,5};
        process(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        int[] arr2 = new int[]{5,6,9,5,6,5,4,2,3,45,78,3,2,6,3,7,5};
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
    public static void process(int[] arr){
        int step = 1;
        int N =  arr.length;
        while (step<N){
            int L = 0;
            while (L<N){
                if (step>=N-L){
                    break;
                }
                int M = L+step-1;
                int R = M+Math.min(step,N-M-1);
                merge(arr, L, M, R);
                L = R+1;
            }
            if (step>N/2){
                break;
            }
            step<<= 1;

        }
    }
    public static void merge(int[] arr,int l,int mid,int r){
        int[] help = new int[r-l+1];
        int i = 0;
        int p1 = l;
        int p2 = mid+1;
        while (p1<=mid&&p2<=r){
            help[i++] = arr[p1]<=arr[p2]?arr[p1++]:arr[p2++];
        }
        while (p1<=mid){
            help[i++] = arr[p1++];
        }
        while (p2<=r){
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[l+i] = help[i];
        }
    }
}
