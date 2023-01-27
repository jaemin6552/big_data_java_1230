package 제네릭일반;

import java.util.ArrayList;
import java.util.List;

// 컴파일 시 강한 타입 체크 /자바 8이전 대비 변경 사항
// 타입변환 제거 / 자바 8이전 대비 변경 사항
public class GenericTestEx {
    public static void main(String[] args) {
//        List list = new ArrayList(); //자바 8이전 스타일 강한 타입체크가 안되어있어서
//        list.add(0);
//        String str = (String) list.get(0); //여기서 잘못된 값을 넣기때문에 오류가남...
//        System.out.println(str);
        //제너릭타입
        // List에서 사용할 데이터 타입을 미리 지정함으로 컴파일 시 타입체크가 일어 나도록 함
        List<String> list = new ArrayList<>();
        list.add("hello");
        String str = list.get(0); //0번째 리스트 값을 가져옴
        System.out.println(str);

    }
}
