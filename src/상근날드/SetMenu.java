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
        int []setMenue = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<setMenue.length; i++)
        {
            System.out.println("가격을 입력하시오 : ");
            setMenue[i] = sc.nextInt();
        }
        int Hmin = setMenue[0];
        int Wmin = setMenue[3];
        for (int i = 0; i<setMenue.length-2; i++){
            if(setMenue[i] <Hmin ) Hmin = setMenue[i];

            if(setMenue[i+1] > setMenue[i+2]) {
                Wmin = setMenue[i + 2];
            }
            else {
                Wmin = setMenue[i+1];
            }
        }
        System.out.println("최소값 : " + (Wmin+Hmin-50));

    }


}
