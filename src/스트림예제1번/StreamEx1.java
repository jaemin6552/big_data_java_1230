package 스트림예제1번;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// 스트림이란? 함수형 프로그램을 이용해 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
// - 자료의 대상과 상관없이 동일한 연산 수행
// - 내부 반복자 이용(반복문 배재)
// - 스트림은 한번 생성 된후 최종연산을 통해 소모되면 재 사용 안됨
// - 원본 데이터 변경하지 않음
// - 지연 연산 지원, 병렬 처리 지원
// - 스트림은 생성 -> 중계 연산 -> 최종 연산 순서로 진행 됩니다.
public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        //스트림 생성, 중간 연산, 최종 연산
        //list.stream().filter(s->s.intValue() >= 5).forEach(System.out::println);
        int sum = list.stream().mapToInt(i->i).sum(); //mapToInt(중계연산)
        int count = (int) list.stream().count(); //count 반환값은 long 타입이므로 (int)로 타입 캐스팅이 필요함.
        System.out.println("합계 : " + sum);
        System.out.println("횟수 : " + count);
    }
}
