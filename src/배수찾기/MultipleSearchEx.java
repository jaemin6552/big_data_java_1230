package 배수찾기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 정수 n류의 목록이 주어졌을때, 목록에 들어있는 수가 n의 배수인지 아닌지 구하는 프로그램 작성
// 입력 : 첫째 줄에 n을 입력함, 다음줄에 한줄에 한개씩 목록에 들어 있는 수를 입력(0~10000)
// 출력 : 목록에 있는 수가 n의 배수인지 아닌지를 구한 후 아래 처럼 출력
// 3 -> 주어진 수
// 1
// 7
// 99
// 321
// 777
// 0 -> 반복문에 대한 종료 조건
public class MultipleSearchEx {
    public static void main(String[] args) {
        List<Integer> numlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = 1;

        while(num != 0) {
        num = sc.nextInt();
        numlist.add(num);
        }
        num = numlist.get(0);
        for(int i = 0; i<numlist.size()-1; i++){
            if(numlist.get(i+1) % num ==0) {
                System.out.println(numlist.get(i+1)+"는 " + num + "의 배수입니다.");
            }else {
                System.out.println(numlist.get(i+1)+"는 " + num + "의 배수가 아닙니다.");
            }
        }
    }
}
