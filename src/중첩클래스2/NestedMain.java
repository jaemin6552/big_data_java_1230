package 중첩클래스2;

public class NestedMain {
    public static void main(String[] args) {
        OutClass outClass =new OutClass();
        outClass.usingClass();
        OutClass.InClass.inTest();
    }
}
