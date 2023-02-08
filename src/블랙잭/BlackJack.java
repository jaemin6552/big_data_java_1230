package 블랙잭;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int card = sc.nextInt(); //카드의 개수입력
        int m = sc.nextInt(); //목표 숫자
        int rst = 0;
        int []addCard = new int[card];
        for(int i =0; i<card; i++){
            addCard[i] = sc.nextInt();
        }
        int sum = 0;

        for(int i = 0; i<card-2; i++){
            for(int j = i+1; j<card-1; j++){
                for(int k = j+1; k<card; k++){
                    sum = addCard[i] + addCard[j] + addCard[k];
                    if(sum <= m && sum < rst){
                        rst = sum;
                        }
                    }
                }
            }
        System.out.println(rst);

    }
}
