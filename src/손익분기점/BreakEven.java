package 손익분기점;

import java.util.Scanner;

public class BreakEven {
    public static void main(String[] args) {
        int basic;
        int variable;
        int sell;

        Scanner sc = new Scanner(System.in);
        System.out.print("기본생산 비용 입력 : ");
        basic = sc.nextInt();
        System.out.print("가변생산 비용 입력 : ");
        variable = sc.nextInt();
        System.out.print("판매 가격 입력 : ");
        sell = sc.nextInt();

            if(variable >= sell-variable ){
               System.out.println(-1);
            } else{
                System.out.println("손익분기 넘는지점 : " + basic/(sell-variable) +1);
            }


    }

}
