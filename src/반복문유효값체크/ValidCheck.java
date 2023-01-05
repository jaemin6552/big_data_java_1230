package 반복문유효값체크;

import java.util.Scanner;
//반복문을 이용해서 유효값 체크 하기
//do ~ while() : 먼저 한번실행하고 조건 확인
public class ValidCheck {
    public static void main(String[] args) {
        int age;
        boolean isFirst = true;
        Scanner sc = new Scanner(System.in);
        do {
            if(!isFirst) System.out.println("나이를 재입력 하세요 : ");
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
            isFirst = false;
        } while(age <= 0 || age >= 200);

        System.out.println("입력하신 나이는 " + age + " 입니다.");

    }
}
