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
        System.out.print("알파벳  입력 : ");
        String alphabet = sc.next();
        alphabet = alphabet.toUpperCase();
        int []abcCount = new int[26];

        for(int i = 0; i<alphabet.length(); i++) {
            for(int j = 0; j<abcCount.length; j++){
                if(alphabet.charAt(i) == 'A'+ j) {
                    abcCount[j]++;
                }
            }
        }

        int mostCount = abcCount[0];
        int mostAlpa = 0;
        for(int i = 0; i<abcCount.length; i++){
            if(abcCount[i] > mostCount) {
                mostCount = abcCount[i];
                mostAlpa = i;
            } else if(abcCount[i] == mostCount){
                if(mostAlpa != i) mostAlpa = -2;
                else mostAlpa = i;
            }

        }
        System.out.println("가장 많이나온 알파벳 : " + (char)(mostAlpa+'A'));
    }
}
