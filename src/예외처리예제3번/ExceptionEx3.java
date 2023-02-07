package 예외처리예제3번;
// NUllPointerException : 참조하고 있는 주소를 접근 했을 때 값이 없는 경우
public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;
        try {
            String testStr = test.name;
            System.out.println(test);
        } catch (NullPointerException e){
            System.out.println("참조하고 있는곳에 아무것도없습니다.");
        }
    }
}

class Test {
    String name = "JM";
}