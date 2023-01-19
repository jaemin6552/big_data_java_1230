package 두번째숫자찾기;

import java.util.Scanner;

// 임의의 숫자 10개를 입력 받아 중복된 숫자 중 2번째 등장하는 숫자의 위치 찾기 : 1 2 3 4 5 1 2 3 4 5
// 5 입력시 10이 나와야함
// 임의의 수 입력 : 1 2 3 4 5 5 6 7 8 2
// 찾을 수 : 5
// 결과 : 6
// 만약에 2번째 등장하는 수가 없으면 -1 출력
public class SecondNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int target = 0;
        int []num = new int[10];
        for(int i = 0; i<num.length; i++) {
            System.out.printf("숫자 입력 : \r");
            num[i] = sc.nextInt();
        }
            System.out.print("찾을수 입력 : ");
            int findN = sc.nextInt();
            for(int i = 0; i<num.length; i++){
                if(num[i] == findN) {
                    count++;
                    if(count == 2) {
                        System.out.println("결과 : " + (i+1));
                        break;
                    }
                }
            }
            if(count != 2) {
                System.out.println(-1);
    }

}


}
