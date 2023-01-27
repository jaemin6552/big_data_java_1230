package 과일이름정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//임의의 과일 이름 10개의 배열 생성
//길이 순으로 정렬하고 길이가 같은 경우 사전(알파벳 순서)정렬 하기
//String length()
//String compareTo()
public class FruitTest {
    public static void main(String[] args) {
        String []fruit = new String[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< fruit.length; i++){
            fruit[i] = sc.next();
        }
        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() < o2.length()) return -1;
                 if(o1.length() == o2.length()) {
                   return o1.compareTo(o2);
                }
               return -1;
            }
        });


        System.out.println(Arrays.toString(fruit));
    }
}
