package 스트림예제6번;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//스트림의 최종 연산 : 중계 연산을 통해 변환된 스트림은 마지막으로 최종 연산을 통해 요소를 소모해 결과를 출력
public class StreamEx6 {
    public static void main(String[] args) {
        //요소의 출력
        Stream<String> stream = Stream.of("하나","둘","셋","넷");
        stream.forEach(e->System.out.print(e + " "));
        //요소의 소모 : 스트림의 요소를 소모하여 연산을 수행
        //reduce() : 첫 번째 요소와 두 번째 요소를 가지고 연산을 수행 후, 그 결과와 세번째 요소를 가지고 다시 연산
        String []str = {"하나","둘","셋","넷"};
        Integer []strInt = {1,2,3,4,5,6};
        System.out.println();
        List<String> list = new ArrayList<>(Arrays.asList(str));
        List<Integer> list1 = new ArrayList<>(Arrays.asList(strInt));

        Optional<String> rst1  = list.stream().reduce((s1,s2)->s1 + "+" +s2); //null을 막아주는 기능
        rst1.ifPresent(System.out::println);

        //요소의 검색 : findFirst(), findAny() : 해당 스트림에서 첫번째 요소를 반환
        IntStream stream4 = IntStream.of(4,2,7,8,9,1,6);
        IntStream stream5 = IntStream.of(4,2,7,8,9,1,6);
        OptionalInt rst2 = stream4.sorted().findFirst();
        System.out.println(rst2.getAsInt());
        OptionalInt rst3 = stream5.sorted().findAny(); //병렬처리관련된 부분이 포함되서 꼭 첫번째 요소가 반환되지 않을수 있음.
        System.out.println(rst3.getAsInt());

        //요소의 검사 :
        //anyMatch() : 해당 스트림의 일부 요소가 조건에 만족하면 true
        //allMatch() : "모든"요소가 조건에 만족하면 true
        //noneMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족하지 않을 경우 true
        IntStream stream6 = IntStream.of(30,90,70,10);
        IntStream stream7 = IntStream.of(30,90,70,10);
        IntStream stream8 = IntStream.of(30,90,70,10);
        System.out.println(stream6.anyMatch(n->n > 80)); //true
        System.out.println(stream7.allMatch(n->n >9)); //false -> true
        System.out.println(stream8.noneMatch(n->n>90)); //false -> true

        //요소의 통계 : count(), max(), min()
        System.out.println(list1.stream().count());
        System.out.println(list1.stream().count());
        IntStream stream9 = IntStream.of(1,2,3,4,5,6,7);
        System.out.println(stream9.min().getAsInt());

        //요소의 연산
        IntStream stream10 = IntStream.of(30,90,100,80);
        DoubleStream stream11 = DoubleStream.of(30.3,90.9,100.0,80.8);
        System.out.println(stream10.sum());
        System.out.println(stream11.average().getAsDouble());

        int a =list1.stream().skip(1).limit(3).mapToInt(e->e).sum();
        System.out.println(a);

    }
}
