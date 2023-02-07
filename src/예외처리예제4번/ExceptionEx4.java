package 예외처리예제4번;

import java.util.Scanner;

// ArithmeticException : 연산 오류
public class ExceptionEx4 {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("나누셈 입력: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try{
                rst = a / b;
            }catch (ArithmeticException e){
                System.out.print("0으로 나누면 안됩니다.\n");
                continue;
            }
            System.out.println("result : " + rst);
            break;
        }
    }
}
