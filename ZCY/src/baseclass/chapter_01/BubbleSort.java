package baseclass.chapter_01;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {7,4,5,4,3,8,9,1,0,6};
        int[] b = {7,4,5,4,3,8,9,1,0,6};
        print(a);
        print(bobbleSort(b));
    }

    public static int[] bobbleSort(int[] arr){
        if (arr==null||arr.length<=1){
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] =arr[b];
        arr[b] = temp;
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
}
