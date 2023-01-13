package 소수판별하기;
// 소수란 : 1과 자기자신 이외에는 나누어 지지 않는 수
// 소수 판별하기 : OK
// 소수의 합 구하기 : 정수 값을 입력 받아, 입력 받은 정수값 미만의 소수의 합을 구하는 문제
// 정수 입력 : 12
// 결과 : 2 + 3 + 5 + 7 + 11 = 28;
// 문제를 푸는 방법 : 메소드를 호출 시 정수 값을 입력해서 해당 정수가 소수이면 그 값을 반환
import java.util.Scanner;

public class PrimeEx1 {
    public static void main(String[] args) { //JVM이 main이 하나 여야만 찾는데 모호하지않아서 static이 붙음
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int number = sc.nextInt();
        int sum = 0;
        for(int i = 2; i<= number; i++) {
            sum += primeSum(i);
        }
        System.out.println("소수의 합 : " + sum);
    }

    static int primeSum(int n) { //static이붙으면 객체소속이아닌 메소드가됨
        //1과 입력 받은 값을 제외, 즉 2 ~ 입력 받은 값 미만
        int tmp = 0;
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) isPrime = false;
        }
        if(isPrime) return n;
        else return 0;
    }
}

