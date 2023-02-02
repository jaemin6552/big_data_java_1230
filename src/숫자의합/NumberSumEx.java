package 숫자의합;

import java.util.HashSet;
import java.util.Scanner;

// 문제 : N개의 숫자가 공백없이 쓰여 있음. 이숫자를 모두 합해서 출력하는 문제
// 입력 : 54321
// 출력 : 15
// 입력 : 7000000000
// 출력 : 7
// 입력 : 5678
// 출력 : 26
// 입력 : 0000
public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum;
        String num;
        while(true) {
            sum = 0;
            num = sc.next();
            for (int i = 0; i < num.length(); i++) {
                sum += num.charAt(i)-'0';
            } if(sum == 0) break;
            System.out.println(sum);
        }

    }
}
