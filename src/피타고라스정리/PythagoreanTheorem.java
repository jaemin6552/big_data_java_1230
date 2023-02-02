package 피타고라스정리;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class PythagoreanTheorem {
    public static void main(String[] args) {
        short a,b,c;
        short [] num= new short[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력 : ");
        List<String>list = new ArrayList<>();
        while(true) {
            num[0] = sc.nextShort();
            num[1] = sc.nextShort();
            num[2] = sc.nextShort();
            if(num[0] ==0 && num[1] == 0 && num[2] == 0) break;
            Arrays.sort(num);
            if(num[2]*num[2] == (num[1]*num[1])+(num[0]*num[0])) list.add("right");
            else list.add("wrong");
        }
        for(String e : list)  System.out.println(e);
    }
}