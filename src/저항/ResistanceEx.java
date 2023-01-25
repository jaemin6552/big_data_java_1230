package 저항;

import java.util.Arrays;
import java.util.Scanner;

//전자 제품에서는 저항이 들어 간다. 처음 색2개는 저항의 값, 마지막은 곱해야 하는 값
//색 : black, brown, red, orange, yellow, green, blue, violet, grey ,white
//값 : 0,1,2,3,4,5,6,7,8,9
//곱 : 1, 10, 100, 1,000, 10,000, 100,000, 1,000,000, 10,000,000, 100,000,000, 1,000,000,000
public class ResistanceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []color = new int[3];
        String tmp;
        int count = 0;
        //문자열을 비교해서 인덱스를찾기 위해
        String []colorTmp = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey" ,"white"};
        int []colorLong = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        for(int i = 0; i<color.length; i++) {
            System.out.print("색 입력: ");
            tmp = sc.next();
            for (int j = 0; j < colorTmp.length; j++) {
                if (tmp.equalsIgnoreCase(colorTmp[j])) {
                    if (i < 2) color[count++] = j;
                    else {
                        color[count++] =colorLong[j];
                    }
                }
            }
        }
        System.out.println("값 : "+ ((long)color[0] * 10 + color[1]) * color[2]);
    }
}
