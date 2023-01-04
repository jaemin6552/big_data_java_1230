package 제일큰값찾기;

import java.util.Scanner;

//세자리의 정수를 입력받아서 100의자리, 10의자리, 1의자리로 나누어 담고 이중 가장 큰 수 찾기
public class MaxValue {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        a = sum / 100;
        b = (sum %100) / 10;
        c = sum % 10;

        if(a>b){
           System.out.println(Math.max(a,c));
        } else{
            System.out.println(Math.max(b,c));
        }
    }
}
