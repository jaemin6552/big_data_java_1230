package Arrays클래스;

import 단어공부.Main;

import java.util.*;

//Arrays : 배열을 다루기 위한 다양한 메소드를 포함하고 있습니다.
//binarySearch() : 이분 검색 알고리즘 제공
//sort() : 기본적인 오름차순, 그리고 매개변수를 이용해 내림차순, 그리고 오버라이딩 통한 직접 구현
//toString() : 배열의 요소를 문자열로 출력
//asList() : 일반 배열을 ArrayList 로 변환
//배열의 개수 입력, 찾을 수 입력
public class ArraysTestEx {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 4, 1, 2, 345, 777, 657, 235};
        Arrays.sort(arr); //오름 차순 정렬
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        if (o1 < o2) return 1;
                        else return -1;
                    }
                });
        System.out.println(Arrays.toString(arr));

//        Scanner sc = new Scanner(System.in);
//        System.out.print("배열의 개수 : ");
//        int num = sc.nextInt();
//        int []arr = new int[num];
//        System.out.print("찾을수 입력 : ");
//        int key = sc.nextInt();
//        System.out.println();
//        for(int i  = 0; i< arr.length; i++){
//            arr[i] = (int)(Math.random() * num) +1 ; // 배열의 개수 범위내의 값으로 난수 발생
//        }
//
//        Arrays.sort(arr);
//        for(int e : arr) System.out.print(e + " ");
//        int rst = Arrays.binarySearch(arr,key); //배열 이름과 찾을값을 매개변수로 전달함
//        if (rst >= 0)System.out.println("찾는값 인덱스 위치 : " + rst);
//        else System.out.println("찾는값이 없습니다.");
        //결과값으로 해당값이 있는 인덱스가 반환되고 없다면 -1이 반환됨

    }
}
