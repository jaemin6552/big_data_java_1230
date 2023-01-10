package 시간입력;

import java.util.Scanner;

// 입력 : 23:05:03 (24시간제로 시간을 콜론(:) 기준으로 입력)
// 출력 : 오후 11시 05분 03초
public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
        String time = sc.nextLine();
        String[] cTime = time.split(":");

       if(Integer.parseInt(cTime[0]) > 12) {
           System.out.println("오후" + (Integer.parseInt(cTime[0])-12) + "시 "+ cTime[1] + "분 " + cTime[2] + "초 입니다");
       } else if(Integer.parseInt(cTime[0]) == 12){
            System.out.println("오후" + (Integer.parseInt(cTime[0])) + "시 "+ cTime[1] + "분 " + cTime[2] + "초 입니다");
       } else {
           System.out.println("오전" + (Integer.parseInt(cTime[0])) + "시 " + cTime[1] + "분 " + cTime[2] + "초 입니다");
       }

    }
}
