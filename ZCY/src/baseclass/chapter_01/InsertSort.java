package baseclass.chapter_01;

public class InsertSort {

    public static int[] insertSort(int[] arr){
        if(arr == null||arr.length<=1){
            return arr;
        }
        //左神做法
//        for (int i = 1; i < arr.length; i++) { // 0 ~ i 做到有序
//            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
//                swap(arr, j, j + 1);
//            }
//        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >=1 ; j--) {
                if (arr[j]<arr[j-1]){
                    ArrayUtils.swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {7,4,5,4,3,8,9,1,0,6,5,2,6,9,10};
        ArrayUtils.print(a);
        ArrayUtils.print(insertSort(a));
    }
}
