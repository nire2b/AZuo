package baseclass.chapter_02;

import org.junit.Test;
import baseclass.chapter_01.ArrayUtils;
import baseclass.chapter_01.SelectSort;

import java.util.Arrays;

public class Logarithmic {

    public static int[] IntArray(int maxLen,int MaxValue){
        int[] arr = new int[(int)(Math.random()*maxLen)+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(MaxValue+1));
        }
        return arr;
    }

    @Test
    public void test01(){
        int[] ints = IntArray(10, 100);
        System.out.println(Arrays.toString(ints));
        SelectSort.selectSort(ints);
        ArrayUtils.print(ints);
    }
}
