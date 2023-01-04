package 연산자연습1;

import java.util.Scanner;

//이항연산자 삼항연산자
//산술연산자 : +, -, *, /, %(나머지)
//대입연산자 : 값을 변수에 대입할 때 사용 , 대입은 항상 뒤에서 앞으로 일어 남
//복합대입연산자 : 대입이전에 자신의 값에 다른값을 연산하고 대입하는것
//증감연산자 : 값을 1증가하거나 감소시키는 연산자(단항연산자) //후위와 전위에 따라 상황이 달라짐
//비교연산자 : 값의 크기를 비교하는 연산자
//논리연산자 : 참과 거짓을 판단 하는 것? AND(&&) OR(||) NOT(!)
//삼항연산자 : 항이 3개인 연산자(이건 참과 거짓이 있는 조건문과 같음)
//문자열 결합 연산자 : 문자열을 이어주는 연산자.
public class OperatorEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력 하세요");
        int age = sc.nextInt();
        boolean isAdult = (age > 19) ? true : false;

        System.out.println(isAdult);
    }
}
