package 중첩클래스2;

public class NestedMain {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass(); // 내부 클래스 기능 호출

    }
}
