package 스트림예제3번;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 배열로 부터 스트림 만들기
public class StreamEx3 {
    public static void main(String[] args) {
        String[] arr = {"jm","gandalf","frodo","sauron"};
        Stream<String> stream1 = Arrays.stream(arr); //배열로 부터 스트림을 만듬
        stream1.forEach(e->System.out.println(e + " "));
        System.out.println();


        Stream<String> stream2 = Arrays.stream(arr,1,4); // 1 ~ 4미만
        stream2.forEach(e->System.out.println(e + " "));
        //숫자 범위로 부터 스트림 만들기

        IntStream stream =IntStream.rangeClosed(1,100);
        int sum = stream.sum();
        System.out.println(sum);
    }
}
