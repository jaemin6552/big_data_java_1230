package 십진수이진수간변경;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(binaryNumber(num));
        int num1 = binaryNumber(num);
        System.out.println(decimalNumber(num1));

    }
    public static int decimalNumber(int binaryNumber){
        int i =0;
        int result = 0;
        while((double)binaryNumber / 10 != 0){
            result += binaryNumber % 10 * (int)pow(2,i);
            binaryNumber /= 10;
            i++;
        }
        return result;
    }
    public static int binaryNumber(int decimalNumber){
        int i = 0;
        int result = 0;

        while((double)decimalNumber/2 != 0) {
            result += decimalNumber % 2 * (int)pow(10,i);
            decimalNumber /= 2;
            i++;
        }
        return result;
    }
}

