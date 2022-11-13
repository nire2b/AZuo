package baseclass.chapter_01;

public class SelectSort {

    public static int[] selectSort(int[] arr) {
        int len = arr.length;
        if (len <= 1) {
            return arr;
        }
        int minIndex=0;
        int temp;
        for (int i = 0; i < len; i++) {
            minIndex=i;
            for (int j = i; j < len; j++) {
               if (arr[minIndex]>arr[j]){
                   minIndex=j;
               }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex]=temp;
        }
        return arr;
    }

    public static void print(int[] arr){
        if (arr.length<=0){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {7,4,5,4,3,8,9,1,0,6};
        int[] b = {7,4,5,4,3,8,9,1,0,6};
        print(a);
        print(selectSort(b));

    }
}
