package x보다작은수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 문제 : 정수 N개로 이루어진 배열 A와 정수 X가 주어진다. 이때 A에서 X보다 작은 수를 모두 출력
// 10 5 => 배열의 길이와 주어진 수
// 1 10 4 9 2 3 8 5 7 6
// 결과 : 1 4 2 3
public class LessThanEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int target = sc.nextInt();
        int num;
        List<Integer> list = new ArrayList<>();
        while(length != 0){
            num = sc.nextInt();
            list.add(num);
            length--;
        }
        System.out.print("결과 : ");
        for(Integer e : list){
            if(target > e ) {
                System.out.printf("%d ",e);
            }
        }
    }
}
