package 간판만들기;

import java.util.Scanner;
//각 숫자마다 차지하는 공간이 다르다.
//0은 4칸, 1은 2칸 나머지 수는 3칸을 차지
//간판의 각 숫자 사이는 1칸의 여백이 필요.
//총 입력한 숫자를 표기하기 위해 몇 칸의 공간이 필요한지 계산하는 문제
public class SignBoardMake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String signNumber;
        int sum = 0;
        while(true){
            signNumber = sc.next();
            if(signNumber.equals("0")) break;
            for(int i = 0; i < signNumber.length(); i++) {
                if(signNumber.charAt(i) == '0') {
                    sum += 5;
                }else if(signNumber.charAt(i) == '1'){
                    sum += 3;
                }else{
                    sum += 4;
                }
            }
        }
        System.out.println(sum);


    }
}
