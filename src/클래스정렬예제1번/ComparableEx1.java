package 클래스정렬예제1번;
// Comparable은 클래스 정렬을 구현 할 수 있도록 해주는 인터페이스이며 TreeSet 컬렉션에서 사용해야 함(TreeMap도 가능하긴함 키값으로)
// CompareTo() 메소드를 오버라이딩해서 정렬 조건을 구현 해야 함.
// 정렬 조건은 자신의 객체와 매개변수로 입력 받은 객체를 비교
// 정렬 조건은 양의 정수 값을 반환하면 정렬 조건이 됨
// 정렬 조건을 0으로 반환하면 Set의 특성으로 인해 해당 객체가 표시 되지 않음
import java.util.HashSet;
import java.util.TreeSet;

public class ComparableEx1 {
    public static void main(String[] args) {
        TreeSet<CarSort>treeSet = new TreeSet<>();
        treeSet.add(new CarSort("Sonata",2023,"white"));
        treeSet.add(new CarSort("GV80",2020,"black"));
        treeSet.add(new CarSort("Santafe",2019,"silver"));
        treeSet.add(new CarSort("Teeco",2023,"red"));
        System.out.println(treeSet.size());

        for(CarSort e : treeSet){
            System.out.println(e.color);
            System.out.println(e.modelName);
            System.out.println(e.modelYear);
            System.out.println("===========");
        }

    }
}
