package systemclass.class2;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,1,0,1,108};
        singleNumber(nums);
    }
    public static int singleNumber(int[] nums){
        //Ⅰ
//        int ero = 0;
//        for (int i = 0; i < nums.length; i++) {
//            ero = nums[i]^ero;
//        }
//        return ero;
        //Ⅱ  我的思路
//        int[] arr = new int[32];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < 32; j++) {
//                if ((nums[i]>>j&1)!=0){
//                    arr[j]++;
//                }
//            }
//        }
//        int res = 0;
//        for (int i = 0; i < 32; i++) {
//            if (arr[i]%3!=0){
//                res += 1<<i;
//            }
//        }
//        return res;
        //lc上面的思路
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int total = 0;
            for (int num : nums) {
                total += ((num >> i) & 1);
            }
            if (total % 3 != 0) {
                res |= (1 << i);
            }
        }
        return res;

        //Ⅲ
//        int t = 0;
//        for (int i = 0; i < nums.length; i++) {
//            t = t^nums[i];
//        }
//        int p = t&-t;
//        int T = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if ((nums[i]&p)!=0){
//                T = nums[i] ^ T;
//            }
//        }
//        t = t^T;
//        int[] res = new int[]{t,T};
//        return res;
    }
}
