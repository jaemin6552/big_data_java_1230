package 반복문연습문제1번;

import java.util.Scanner;

// 양의 정수 n을 받아서 n * n 크기의 행렬을 출력하는 프로그램 작성
public class SquareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 1; j<=n; j++) {
                System.out.printf("%3d ",n*i+j);
            }
            System.out.println();
        }
//        System.out.println(1%5);
//        for(int i = 1; i<=n*n; i++){
//            System.out.printf("%4d",i);
//            if(i % n == 0)
//            {
//                System.out.println();
//            }
//        }
    }
}
