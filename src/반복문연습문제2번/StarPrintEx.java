package 반복문연습문제2번;

import java.util.Scanner;

// 입력 : 5
//*
//* *
//* * *
//* * * *
//* * * * *
public class StarPrintEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수입력 : ");
        int num = sc.nextInt();
        for(int i = 0; i<num; i++){

            for(int j = 0; j<i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
