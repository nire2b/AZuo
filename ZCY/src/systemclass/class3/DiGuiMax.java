package systemclass.class3;

public class DiGuiMax {

    public static void main(String[] args) {
        int[] arr = new int[]{5,6,8,0,6,3,5,256,6,6};
        int max = getMax(arr, 0, arr.length-1);
        System.out.println(max);
    }


    public static int getMax(int[] arr,int l,int r){
        if (l==r){
            return arr[l];
        }
        int mid = l+((r-l)>>1);
        int lmax = getMax(arr, l, mid);
        int rmax = getMax(arr, mid+1,r);
        return Math.max(lmax,rmax);
    }
}
