package 상근날드;

import java.util.Scanner;

//맥날짭에서는 세트 메뉴를 판매 합니다.
//햄버거는 3가지 종류가 있고
//음료는 2가지 종류가 있음
//입력은 총 5개의값을 연속으로 입력 하는데 햄버거3가지 가격,음료 2가지 가격을연속으로 입력
//햄버거3가지중 가장 싼 메뉴 선택, 음료 2중 싼 것 선택하고 세트메뉴이기 때문에 50원 할인
//총 세트 메뉴의 금액 구하는 문제
public class SetMenu {
    public static void main(String[] args) {
        int []setMenu = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<setMenu.length; i++)
        {
            System.out.println("가격을 입력하시오 : ");
            setMenu[i] = sc.nextInt();
        }
        int minH = setMenu[0];
        int minD = setMenu[3];
        for (int i = 0; i<setMenu.length-2; i++){
            if(setMenu[i] <minH ) minH = setMenu[i];
            if(setMenu[i+1] > setMenu[i+2]) {
                minD = setMenu[i + 2];
            } else minD = setMenu[i + 1];


        }
        System.out.println("최소값 : " + (minD+minH-50));

    }


}
