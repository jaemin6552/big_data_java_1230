package 인터페이스리모콘;

import java.util.Scanner;

public class RemoteMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품을 선택 하세요 [1]TV [2]Audio : ");
        int sel = sc.nextInt();
        RemoteControl rc;
        if(sel == 1) {
            rc = new Television();
            rc.turnOn();
            rc.setVolume(20);
            rc.getInfo();
            rc.setMute(true); //디폴트 메소드이며 오버라이딩 되어 있는 메소드 사용
        } else{
            rc = new Audio();
            rc.turnOn();
            rc.setVolume(120);
            rc.getInfo();
            rc.setMute(true); //디폴트 메소드이고 부모에서 만든 메소드 사용
        }
        RemoteControl.changeBattery(); //인터페이스 소속의 메소드
        RemoteControl remoteControl = new RemoteControl() {
            private int volume;

            @Override
            public void turnOn() {
                System.out.println("플스5 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("플스5 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                if(volume > MAX_VOLUME){
                    this.volume = MAX_VOLUME;
                } else if(volume < MIN_VOLUME) {
                    this.volume = MIN_VOLUME;
                } else {
                    this.volume = volume;
                }
                System.out.println("현재 Audio 볼륨 : " + this.volume);
            }

            @Override
            public void getInfo() {
                System.out.println("오디오 입니다.");
                System.out.println("현재 볼륨은 " + volume + "입니다.");
            }
        }; //구현부는 세미콜론을 찍어야 오류가안난다.
    }
}
