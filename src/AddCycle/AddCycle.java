package AddCycle;

import java.util.Scanner;

public class AddCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = num;
        int tmp;
        int count = 0;
        do {
            tmp  = (num / 10) + (num % 10);
            num = ((num % 10) * 10) + (tmp % 10);
            count++;
        }
        while(num != answer);
        System.out.println(count);
    }
}
