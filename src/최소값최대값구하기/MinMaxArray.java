package 최소값최대값구하기;

import java.util.Arrays;
import java.util.Scanner;

//정수 값 입력
//입력된 정수 범위의 임의의 값 입력해서 배열 생성
//해당 배열에서 제일 작은 값과 제일 큰 값 찾기
//정수 값 입력 : 10
//1 3 5 7 9
//MIN: 1
//MAX: 9
public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("범위 입력 : ");
        int range = sc.nextInt();
        int[] num = new int[range];
        int min = 0;
        int max = 0;
        for(int i = 0; i<num.length; i++) {
            num[i] = (int)(Math.random()* range) +1;
                 if (num[i] < min || min ==0){
                min = num[i];
                } else if(num[i] > max ) {
                    max = num[i];
                }
        }
        System.out.println(Arrays.toString(num));
        System.out.println("최소값 : " + min +" " + "최대값 : " + max);
    }
}
