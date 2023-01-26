package 열거타입메소드;

import java.util.Arrays;

// values() : 해당 열거체의 모든 상수를 저장한 배열을 생성해서 반환
// valueOf() : 전달된 문자열과 일치하는 해당 열거체의 상수를 반환
// ordinal() : 해당 열거체 정의에서 정의된 순서(0)를 반환함
enum Rainbow {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}
public class EnumMethod {
    public static void main(String[] args) {
        Rainbow []arr = Rainbow.values();
        System.out.println(Arrays.toString(arr));
        Rainbow rb = Rainbow.valueOf("RED");
        System.out.println(rb);
        int index = Rainbow.INDIGO.ordinal();
        System.out.println(index);
    }
}
