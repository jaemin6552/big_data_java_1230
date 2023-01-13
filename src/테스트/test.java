package 테스트;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
      int num = 1;
      int tmp =0;
        while(num<=100){
            tmp += num;
            num++;
      }
        System.out.println(tmp);
        System.out.println(((double)tmp/100));
    }
}
