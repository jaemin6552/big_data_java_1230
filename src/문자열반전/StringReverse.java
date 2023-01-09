package 문자열반전;

import java.util.Arrays;
import java.util.Scanner;

//abcd->dcba
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String tmp = "";
        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
