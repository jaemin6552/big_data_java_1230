package 깊은복사얕은복사;

import java.util.Arrays;

//깊은 복사 : 할당된 메모리 공간에 실제 값이 복사 되는 것(기본 타입 모두여기에 해당 됨)
//얕은 복사 : 참조 타입에 해당되며 실제 값이 복사가 되는 것이 아니라 주소가 복사되는 것을 의미
public class DeepCopy {
    public static void main(String[] args) {
        // 얕은 복사가 발생하는 경우
        int[] arr1 = new int[4];
        arr1[0] = 100;
        int[] arr2 = new int[7]; //얕은 복사가 일어 남
        int[] arr3 = Arrays.copyOf(arr1,arr1.length);
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        arr2 = Arrays.copyOf(arr1,arr1.length);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
