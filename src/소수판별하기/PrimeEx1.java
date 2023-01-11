package 소수판별하기;
// 소수란 : 1과 자기자신 이외에는 나누어 지지 않는 수
// 소수 판별하기 :

import java.util.Scanner;

public class PrimeEx1 {
    public static void main(String[] args) { //JVM이 main이 하나 여야만 찾는데 모호하지않아서 static이 붙음
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int number = sc.nextInt();
        boolean rst = isPrime(number);
        System.out.println("입력된 수 : " + number);
        System.out.println("소수 여부 : " + rst);
    }

    static boolean isPrime(int n){ //static이붙으면 객체소속이아닌 메소드가됨
        //1과 입력 받은 값을 제외, 즉 2 ~ 입력 받은 값 미만
        for(int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                return false; //전달받은 수를 1과 자신을 제외하고 나누어지는 경우를 의미
            }
        }
        if(n ==1) return false;

        return true;
    }
}
