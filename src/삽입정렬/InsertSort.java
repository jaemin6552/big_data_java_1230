package 삽입정렬;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int []arr = {10,8,5,4,1,3,7,9,2,6};
        int current = 0;
        for(int i = 1; i<arr.length; i++){
            for(int j = i-1; j>=0; j--){
                if(arr[i] < arr[j]) {
                    current = j;

                }
                int tmp = arr[current];
                arr[current] = arr[i];

            }

        }
        //System.out.println(Arrays.toString(arr));

    }

}
