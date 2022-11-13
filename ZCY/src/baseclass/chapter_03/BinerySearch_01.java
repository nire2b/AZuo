package baseclass.chapter_03;

import java.util.Arrays;

public class BinerySearch_01 {
    //实现二分查找
    public static void main(String[] args) {
        int[] arr = randomArray(10, 100);
        Arrays.sort(arr);
        int[] a = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5};
        int location = binarySearch(a, 3);

        int[] ints = randomArray(100, 1000);
        int min = min(ints);
        boolean check = check(ints, min);
        System.out.println(check);

    }

    //有序数组找到num的位置
    public static int binerySearch(int[] arr,int num){
        int length = arr.length;
        int L = 0;
        int R = length-1;
        int ans = -1;
        int mid;
        while (L<=R){
            mid = (L+R)/2;
            if (num>arr[mid]){
                L = mid +1;
            }else if (num<arr[mid]){
                R = mid -1;
            }else {
                return mid;
            }
        }
        return ans;
    }
    //有序数组中找到<=num最右的位置
    public static int binarySearch(int[] arr,int num){
        int len = arr.length;
        int L = 0;
        int R = len-1;
        int mid = -1;
        int ans = -1;
        while (L<=R){
            mid = (L+R)/2;
            if(num>= arr[mid]){
                ans = mid;
                L = mid+1;
            }else if (num<arr[mid]){
                R = mid-1;
            }
        }
        return ans;
    }
    //无序且相邻不想等的数组找局部最小值.
    public static int min(int[] arr){
        if (arr==null||arr.length==0){
            return -1;
        }
        if (arr[0]<arr[1]){
            return 0;
        }
        int len = arr.length;
        if (arr[len-1]<arr[len-2]){
            return len-1;
        }
        int L =0;
        int R = len-1;
        int mid;
        while (L<R-1){
            mid = (L+R)/2;
            if (arr[mid]<arr[mid-1]&&arr[mid]<arr[mid+1]){
                return mid;
            }else {
                if (arr[mid]>arr[mid-1]){
                    R = mid -1;
                }else{
                    L = mid +1;
                }
            }
        }
        //因为上面是考虑最少有三个数来进行比较，但实际结果最终只剩下L,R，然后m指向L（m=(L+R)/2），这时候就没法比了。
        return arr[L]<arr[R]?L:R;
    }
    //返回相邻不想等的随机数组。
    public static int[] randomArray(int maxLen,int maxValue){
        int len = (int)(Math.random()*maxLen);
        int[] arr = new int[len];
        arr[0] = (int)(Math.random()*maxValue);
        for (int i = 1; i < len; i++) {
            do {
                arr[i] = (int)(Math.random()*maxValue);
            }while (arr[i]==arr[i-1]);
        }
        return arr;
    }
    //检查传入值是否为局部最小
    public static boolean check(int[] arr,int minIndex){
        int len = arr.length;
        int left = minIndex-1;
        int right = minIndex+1;
        boolean l = left < 0 || arr[left] > arr[minIndex];
        boolean r = right<len?arr[right]>arr[minIndex]:true;
        return l&&r;
    }

}
