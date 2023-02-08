package 스트림예제5번;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 중개 연산 : 생성된 스트림은 중개 연산을 통해 또 다른 스트림으로 변환, 중개 연산은 연속으로 연결해서 사용 가능
// filter() : 조건에 맞는 요소만으로 구성된 새로운 스트림 반환
// distinct() : 스트림에서 중복된 요소를 제거하고 새로운 스트림 생성
// 7개의 정수를 입력 받아 홀수 짝수 나누어 담기
public class StreamEx5 {
    public static void main(String[] args) {
//        IntStream stream1 = IntStream.of(7,5,5,2,1,3,5,4,6);
        IntStream stream2 = IntStream.of(7,5,5,2,1,3,5,4,6);

        Scanner sc = new Scanner(System.in);
        Integer[] num = new Integer[7];
        //for (int i = 0; i < num.length; i++)  num[i] = sc.nextInt();

        Stream<Integer> oddStream = Arrays.stream(num);
        Stream<Integer> evenStream = Arrays.stream(num);
        // 스트림에서 홀수 값만 골라냄
//        oddStream.filter(n -> n % 2 != 0).forEach(n->System.out.print("홀수 :" + n + " "));
//        System.out.println();
//        evenStream.filter(n -> n % 2 == 0).forEach(n->System.out.print("짝수 :" + n + " "));
        //스트림에서 중복 요소를 제거
        //stream2.distinct().forEach(System.out::println);

        // 스트림 변환(map()) : 해당 스트림의 요소들에 주어진 함수의 인수로 전달하여, 그 반환 값으로 이루어진 새로운 스트림 생성
        Stream<String> stream = Stream.of("HTML","CSS","JAVA","JAVASCRIPT");
        stream.map(e->e.length()).forEach(System.out::println);

        //flatMap() : 이거안쓰면 안쪼개짐 split으로도
        String []arr = {"I study hard","You study JAVA","I am hungry"};
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.flatMap(s->Stream.of(s.split(" "))).forEach(System.out::println);

        // 스트림 제한
        // limit() : 해당 스트림의 첫 번째 요소부터 전달된 개수 만큼의 요소로만 이루어진 새로운 스트림 반환
        // skip() : 해당 스트림의 첫 번째 요소부터  전달된 개수 만큼의 요소를 제외하고 출력
        IntStream stream3 = IntStream.range(0,10);
        IntStream stream4 = IntStream.range(0,10);
        IntStream stream5 = IntStream.range(0,10);
        stream3.limit(5).forEach(n->System.out.print(n + " "));
        System.out.println();
        stream4.skip(5).forEach(n->System.out.print(n + " "));
        System.out.println();
        stream5.skip(3).limit(5).forEach(n->System.out.print(n + " "));
        System.out.println();

        //스트림 정렬 : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
        Stream<String> stream6 = Stream.of("jm","kjm","what","hype");
        Stream<String> stream7 = Stream.of("jm","kjm","what","hype");
        stream6.sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        stream7.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
    }
}