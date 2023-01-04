package 변수의생존범위;

import java.util.Scanner;

public class ScopeData {

    public static void main(String[] args) {
    final double taxRate = 0.10;
    Scanner sc = new Scanner(System.in);
    System.out.print("당신의 수입을 입력하세요");
    int income = sc.nextInt();
    System.out.println("당신이 내야할 세금은" + income * taxRate);
    }
}
