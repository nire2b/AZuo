package baseclass.chapter_01;

public class ArrayUtils {

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
    public static int[] copy(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }
        return arr2;
    }
}
