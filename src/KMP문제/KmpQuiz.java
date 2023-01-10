package KMP문제;

import java.util.Scanner;

public class KmpQuiz {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String name = sc.nextLine();
        String []nameR = name.split("-");
        for(int i = 0; i< nameR.length; i++ ) {
            System.out.printf("%c", (nameR[i].charAt(0)));
        }
        //System.out.println(name.charAt(name.indexOf("-")+1));
    }
}
