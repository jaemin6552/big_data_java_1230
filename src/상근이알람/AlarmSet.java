package 상근이알람;

import java.util.Scanner;

// 상근이라는 친구는 매일 학교를 지각 합니다.
// 창영이라는 친구가 상근이에게 지각하지 않는 방법을 알려 줍니다.
// 시간을 설정하면 자동으로 45분 일찍 알람이 울리도록 시간이 설정되도록 함.
// 24시간제
public class AlarmSet {
    public static void main(String[] args) {
        //시간을 입력받기위해 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        //생성된 객체로 시간과 분을 입력 받음 (24시간제)
        System.out.print("시간을 입력하세요 : ");
        int hours = sc.nextInt();
        System.out.print("분을 입력하세요 : ");
        int minutes = sc.nextInt();
        //변수를 만들어서 입력 받은 시간과 분을 모두 분으로 환산
        int sum = (hours * 60) + minutes;
        if(sum > 1440 || minutes >=60) return;
        //고려사항 : 환산한 시간이 45분 보다 적으면 별도의 계산이 필요
        if(sum <45 )
        {
            sum = 1395+sum;
            hours = sum /60;
            minutes = sum % 60;
            System.out.println("알람예정시간은 전날 " + hours + " 시 " + minutes + " 분 입니다");
        }else {
            //창영이가 알려준 방법대로 시간을 45분 이전으로 돌림(45를 빼줌)
            sum = sum - 45;
            //계산결과를 시간과 분으로 출력하기위해 다시 변환 후 출력
            hours = sum / 60;
            minutes = sum % 60;
            System.out.println("알람예정시간은 " + hours + " 시 " + minutes + " 분 입니다");
        }

    }
}
