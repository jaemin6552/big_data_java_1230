package 영화표예매;
//영화표 예매하기 클래스를 만들고 객체 생성
//극장의 좌석은 10개(10개의 좌석예약 상태를 기록하기 위한 배열 필요)
//좌석당 가격은 12000원
//메뉴는 예약하기와 종료로 구성
//예약하기에서는 현재 좌석의 예약 상태를 보여 주고 예약을 받음
//종료는 판매된 좌석의 개수를 확인해서 판매 금액을 구함(3* 12000 =36000)

import java.util.Scanner;

//현재 좌석 상태를 보여주는 메소드 필요
//좌석을 예매하는 메소드가 필요
//판매된 좌석의 개수를 구해 총 판매 금액을 구하는 메소드가 필요
public class MovieTicket {
        //극장의 좌석상태를 표시하는 배열(총10개)
        int []seat = new int[10];
        int count =0;
        //현재 좌석 상태를 보여주는 메소드 작성
        //0이면 [] 1이면 [V]
        void printSeat(){
            for(int i = 0; i<seat.length; i++){
                if(seat[i] == 1){
                    System.out.print("[V] ");
                } else{
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
        //좌석을 예약하는 메소드
        void selectSeat(){
            //printSeat() 호출해 현재 좌석 상태를 보여줌
            //좌석 번호를 입력 받아서 좌석을 예약하는데 이미 예약된 좌석은 에러 문구 출력하고 재입력 요구
            //좌석 예약이 성공하면 다시 printSeat()를 호출해 좌석 상태를 보여 줌
            printSeat();
            Scanner sc = new Scanner(System.in);
                if(count ==10) {
                    System.out.println("남은 좌석이 존재하지 않습니다.");
                    return;
                }
                System.out.println("원하는 좌석 입력 : ");
                int num = sc.nextInt();
                if (seat[num-1] == 0) {
                    seat[num-1] = 1;
                    count++;
                    printSeat();
                } else {
                    System.out.println("이미 예약된 좌석 입니다.");
                }
        }

        int totalAmount(){
            //좌석 예약 정보를 가지고있는 배열을 순회해 예약된 좌석 개수를 누적
            //좌석 개수와 좌석당 가격을 곱해서 결과를 반환
            int tmp =0;
            for(int i = 0; i<seat.length; i++)
            {
                if(seat[i] == 1){
                    tmp ++;
                }
            }
            return 12000 * tmp;
        }
}
