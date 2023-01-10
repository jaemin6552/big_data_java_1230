package 대소문자변경;

import java.util.Scanner;

// 영문자 소문자와 대문자로 이루어진 단어를 입력 받은 뒤, 대문자는 소문자로, 소문자는 대문자로 변경
// 무조건 입력은 영문자이다.
// WrongAnswer => wRONGaNSWER
// 힌트1 : 문자열에서 문자를 추출하는 메소드는 charAt(인덱스)이다.
// 힌트2 : 자바에서 문자는 정수값을 사용된다.
public class UpperLowerChange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String tmp = sc.next();
        char ch;
        for(int i = 0; i<tmp.length(); i++) {
            ch = tmp.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch+=32;
                System.out.println(ch);
            } else{
                ch-=32;
                System.out.println(ch);
            }
        }
    }
}

