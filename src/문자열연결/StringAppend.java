package 문자열연결;

import java.util.Arrays;
import java.util.Scanner;

//문자열 추가하기
//첫번째 문자열 입력 : seoul
//두번째 문자열 입력: korea
//정수값 입력 : 2
//첫번째 문자열에서 입력 받은 갯수 만큼의 문자를 뒤에서 부터 잘라, 두번째 문자열 앞에 추가하기
public class StringAppend
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String std = sc.next();
        System.out.println("문자열 입력 : ");
        String tmp = sc.next();
        System.out.println("정수 입력 : ");
        int num = sc.nextInt();

        //std.substring(std.length()-num-1,std.length());

        System.out.println(  std.substring(std.length()-num) + tmp);
    }
}
