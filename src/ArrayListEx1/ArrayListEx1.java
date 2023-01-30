package ArrayListEx1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// List 인터페이스란? 배열과 비슷한 구조를 가지며 하위에 ArrayList, Vector ,LinkedList 클래스로 구성 됨
// 요소의 저장 순서가 유지, 중복 저장 허용, 동적 할당(크기 지정을 안해도 됨), 다양한 메소드 제공
// ArrayList : 물리적으로 연속된 공간에 저장, 검색을 인덱스로 하기 때문에 빠름, 삽입/삭제는 느림(단, 맨뒤의 삽입 / 삭제는 빠름)
// Vector : ArrayList와 동일 특성을 가짐, 멀티스레드 환경을 위해 동기화 기능 지원하기 때문에 안정적이나 ArrayList보다 느림
// LinkedList : 물리적으로 연속된 공간이 아님, 참조로 다음/이전 저장 위치를 가리킴, 삽입/삭제는 매우 빠름, 검색은 느림
public class ArrayListEx1 {
    public static void main(String[] args) {
        //ArrayList<String> pitches = new ArrayList<>();
        String[] data = {"138","145","122","162"}; //이미 만들어진 배열
        //List<String> pitches = new ArrayList<>(); //호환성을 위해서는 다형성을 이용해 List 인터페이스로 ArrayList 객체를 참조 함
        List<String> pitches = new ArrayList<>(Arrays.asList(data)); //asList()는 이미만들어진 배열을 List에 추가
        pitches.add("138"); //ArrayList 마지막에 값 추가 (이때 사이즈가 증가 함)
        pitches.add(1,"155"); //해당 인덱스에 값추가(성능에 영향을 미침)
        //pitches.sort(Comparator.reverseOrder()); //내림차순 정렬
        //pitches.sort(Comparator.naturalOrder()); //오름차순 정렬
        System.out.println(pitches);
        System.out.println(pitches.get(3)); //전달된 인덱스의 값을 반환 함
        //System.out.println(pitches.get(5)); //없는 인덱스를 전달하면 예외가 발생함.(예외처리에서 죽지않게 할수있음.
        System.out.println(pitches.size()); // ArrayList의 개수 반환
        System.out.println(pitches.contains("138")); // false 출력됨, 전달된 값이 ArrayList 내에 있는지 확인후 true/false 반환
        System.out.println(pitches.remove(0)); // 리스트에서 해당 항목을 삭제하고 삭제된 항목을 반환
        System.out.println(pitches.remove("131")); // 리스트에서 해당 항목을 삭제하고 삭제여부 true/false 반환
    }
}
