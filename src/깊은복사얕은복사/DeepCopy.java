package 깊은복사얕은복사;
//깊은 복사 : 할당된 메모리 공간에 실제 값이 복사 되는 것(기본 타입 모두여기에 해당 됨)
//얕은 복사 : 참조 타입에 해당되며 실제 값이 복사가 되는 것이 아니라 주소가 복사되는 것을 의미
public class DeepCopy {
    public static void main(String[] args) {
        int x = 100;
        int y;
        y = x;
        x = 200;
       System.out.println("y의 값: " + y);
    }
}
