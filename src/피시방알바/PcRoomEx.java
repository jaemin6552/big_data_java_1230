package 피시방알바;

import java.util.Arrays;
import java.util.Scanner;

// 피시방에 피시가 100대 있음 (배열의 인덱 0~99),
// 손님들은 모두 자기가 앉고 싶어 하는 자리가 있음
// 만약 자기가 앉고 싶어 하는 자리에 다른 손님이 있으면 사용불가 아니면 사용가능
// 손님의 수 입력 : 3
// 손님이 앉고 싶어 하는 자리 번호 : 1 3 5 => 0
// 손님의 수 입력 : 5
// 자리 번호 : 1 1 3 3 5 =>2(거절 횟수)
public class PcRoomEx {
    public static void main(String[] args) {
        boolean []seat = new boolean[100];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("손님 수 입력: ");
        int people = sc.nextInt();
        for(int i =0; i < people; i++){
            System.out.print("손님이 원하는 자리: ");
            int want = sc.nextInt();
            if(seat[want-1] == true){
               // count ++;
            }else {
                seat[want-1] = true;
            }
        }
        System.out.println("거절 횟수 : " + count);
    }
}
