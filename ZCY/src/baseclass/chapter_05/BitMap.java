package baseclass.chapter_05;

public class BitMap {

    public void add(Long[] nums, int num){
        nums[num>>6]  |= (1L<<(num&63));
    }
    public boolean contain(Long[] nums,int num){
        Long temp=nums[num>>6]&1L<<(num%64);
        if(temp==0){
            return false;
        }else {
            return true;
        }
    }

    public void delete(Long[] nums, int num){
        nums[num>>6] &= ~(1L<<(num&63));
    }

    public static void main(String[] args) {
        Long[] nums = new Long[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0L;
        }
        BitMap bitMap = new BitMap();
        bitMap.add(nums, 128);
        System.out.println(bitMap.contain(nums, 128));
        bitMap.delete(nums, 128);
        System.out.println(bitMap.contain(nums, 128));

    }
}
