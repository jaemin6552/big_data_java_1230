package 암호화클래스;

import java.util.Arrays;
import java.util.Scanner;

public class VigenereCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secret = "love";
        System.out.print("평문 입력: ");
        String normal = sc.nextLine();

        char []answer = new char[normal.length()];

        for(int i = 0 ; i<normal.length(); i++) {
            answer[i] = (char)(normal.charAt(i)-(secret.charAt(i % 4) - 96));
            if(normal.charAt(i) == ' ') {
                answer[i] = ' ';
            } else {
                if (answer[i] < 'a') {
                    answer[i] += 26;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
