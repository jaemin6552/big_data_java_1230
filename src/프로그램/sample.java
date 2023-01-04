package 프로그램; //접근제한자(캡슐화)와 연관성이 있음

//접근제한자 : public, protected, default , private;
/*
- 여기는 범위주석입니다.
- 주석이란 ? 사람은 이해하고 컴파일러는 무시하는 영역
- 저자  : JM
- Date : 2023.01.02 오전 10:15
- 목적  : 자바 연습용 프로그램
 */

public class sample { //클래스 이름을 지정,파일이름과 클래스이름이 같아야함(public클래스), 클래스이름은 관례상 첫자를 대문자로 사용
    //main 메소드는 프로그램의 시작위치를 의미하며 JVM이 호출 함.
    //void는 메소드 실행 이후의 반환 타입 중 하나 입니다.
    //{} : 중괄호 : 클래스, 메소드의 범위를 결정
    //() : 소괄호 : 메소드의 매개변수를 넣는 곳
    //[] : 대괄호 : 배열 등을 정리 할 때 사용 됨
    public static void main(String[] args) { //static 정적선언 (하나만만들어짐) 동적x
        System.out.println("Hello, Java");
    }
}