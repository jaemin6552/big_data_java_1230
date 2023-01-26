package 단어공부;

import java.util.Arrays;
import java.util.Scanner;

//알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 등장한 알파벳을 찾는 문제
//입력은 대소문자를 입력하고, 결과는 대소문자 구분 하지 않음
// 만약 가장 많이 등장하는 알파벳이 여러개인 경우는 ?로 출력
// 결과 예시 : AaAbcdd => A
// 결과 예시 : ddcbgrg => ?

public class WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String input1 = input.toUpperCase();
        int count = 0;
        char []tmp = new char[input.length()];

        for(int i = 0; i<input1.length(); i++){
            if(input1.charAt(i) >= 'A' && input1.charAt(i) <='Z'){
                //char[count++] = input1.charAt(i);
            }
        }
        System.out.println(Arrays.toString(tmp));
    }
}
