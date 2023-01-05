package 반복ForEx1;
//for 반복문 : for(초기식;조건식;증감식) {반복 수행 구간}

import java.util.EmptyStackException;
import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int result = recursiveFunc(num);
        System.out.println(result);

    }
    public static int recursiveFunc(int n){
        if(n == 1) return 1;
        return n + recursiveFunc(n -1);
    }
}
