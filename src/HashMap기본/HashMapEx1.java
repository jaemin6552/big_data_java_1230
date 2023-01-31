package HashMap기본;

import java.util.*;

// HashMap : 키와 값으로 구성되어 있음, 키의 중복 여부 확인은 hashCode()를 통해서 수행 함
// 키의 중복은 허용하지 않음, 값은 중복 가능, 순서를 유지 하지 않음.
// 경우에 따라서 hashCode()와 equals()메소드를 오버라이드 해서 사용해야 함.
// HashMap은 성능이 우수하고 멀티스레드 환경을 지원하지 않음(즉 동기화 기능 없음)
// HashTable은 HashMap과 내부 구조가 동일하며,멀티스레드 지원(동기화가능) but 성능이 HashMap보다 떨어짐
// Properties는 HashTable을 상속 받아서 기능을 제약하여 사용(키와 값이 모두 문자열로만 구성됨), 정보를 파일에 저장하거나 읽기위한 용도

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        //객체 추가 : put(키,값)
        map.put("gandalf",300);
        map.put("frodo",60);
        map.put("gandalf",500); //키값이 같으면 뒤에 넣은 값이 들어감
        map.put("legolas",600);
        map.put("gimlee",100);
        map.put("sem",50);

        //객체 찾기 : get(키) 반환값으로 값이 넘어 옴
        System.out.println(map.get("gandalf"));
        //객체 삭제 : remove(키) 삭제가 정상적으로 진행되면 값이 넘어 옴
        System.out.println(map.remove("frodo")); //삭제하면 값만사라지는게 아니라 entry까지 같이 삭제됨

        System.out.println("총 entry 수 : " + map.size());
        // map을 순회하는 방법 : 향상된 for 문 사용
        for(String key : map.keySet()){ //모든 키 를 Set객체에 담아서 리턴
            System.out.println(key + " : " + map.get(key));
        }

        // 반복자로 순회하는 방법(iterator)
        Set<String> keySet= map.keySet(); //map에는 반복자가 없기때문에 특성이 비슷한 Set이라는 컬렉션프레임워크에 담아서 사용
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){ //다음값을 가지고 있는지 여부확인
            String key = iterator.next(); //키를 가져 옴
            System.out.println(key + " : " + map.get(key));
        }

        // 값을 수정하는 메소드
        map.replace("gandalf",300);

        // Map.Entry 전체 삭제
        map.clear(); //내부안에 참조변수들만 삭제됨
        System.out.println("총 entry 수 : " + map.size());
    }
}
