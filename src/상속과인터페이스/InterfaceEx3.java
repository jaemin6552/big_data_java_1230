package 상속과인터페이스;

import java.util.Scanner;

public class InterfaceEx3 {
    public static void main(String[] args) {
        NetworkAdapter2 adapter2 =null;
        Scanner sc =new Scanner(System.in);
        System.out.print("연결할 네트워크 선택 [1]WiFi [2]5G : ");
        int sel = sc.nextInt();
        if(sel == 1) {
            WiFi wifi = new WiFi("KT","JM");
            wifi.connect();
            wifi.sendMsg();
            wifi.rcvMsg();
        } else {
            FiveG fiveG = new FiveG("LG", "사육사");
            fiveG.connect();
            fiveG.sendMsg();
            fiveG.rcvMsg();
        }
    }
}
