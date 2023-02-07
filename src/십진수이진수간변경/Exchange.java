package 십진수이진수간변경;

import java.util.Scanner;

//import static java.lang.Math.pow;

public class Exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(binaryNumber(num));
        num = binaryNumber(num);
        System.out.println(decimalNumber(num));

    }
    public static int decimalNumber(int bin){
        int i =0;
        int result = 0;
        while(bin != 0){
            result += bin % 10 * pow(2,i);
            bin /= 10;
            i++;
        }
        return result;
    }
    public static int binaryNumber(int dec){
        int i = 0;
        int result = 0;
        while(dec != 0) {
            result += dec % 2 * pow(10,i);
            dec /= 2;
            i++;
        }
        return result;
    }
    public static int pow(int num,int cycle){
        if(cycle == 0) return 1;
        return num * pow(num,cycle-1);
    }

}



