package 버블정렬;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        int []num = {5,4,19,6,2,8,10,7};
        int temp = 0;
        for(int i = num.length-1; i>0; i--) {
            for(int j = 0; j < i; j++) {
                if(num[j] > num[j+1]) {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    System.out.println(Arrays.toString(num));
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
