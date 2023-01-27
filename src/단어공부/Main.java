package 단어공부;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("알파벳  입력 : ");
        String alphabet = sc.next();
        alphabet = alphabet.toUpperCase();
        int []abcCount = new int[26];
        int mostCount = 0;
        int result = 0;

        for(int i = 0; i<alphabet.length(); i++) {
                if(alphabet.charAt(i) >= 'A') {
                    abcCount[alphabet.charAt(i) -'A']++;
                }
        }
        for(int i = 0; i<abcCount.length; i++){
            if(abcCount[i] > mostCount) {
                mostCount = abcCount[i];
                result = i;
            } else if(abcCount[i] == mostCount){
                result = -2;
            }

        }
        System.out.println("가장 많이나온 알파벳 : " + (char)(result+'A'));
    }
}
