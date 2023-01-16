package 다형성응용2;

import java.util.Scanner;

public class PolyCar {
    public static void main(String[] args) {
        Driver driver = new Driver("JM");
        SportsCar sportsCar = new SportsCar();
        Bus bus = new Bus();
        Truck truck = new Truck();
        Scanner sc = new Scanner(System.in);
        System.out.print("운전하고 싶은 차를 선택 하세요 [1]스포츠카, [2]버스, [3]트럭 : ");
        int selCar = sc.nextInt();
        switch (selCar) {
            case 1:
                driver.drive(sportsCar);
                break;
            case 2:
                driver.drive(bus);
                break;
            case 3:
                driver.drive(truck);
                break;
            default:
                System.out.println("잘못 입력 하셨습니다.");
                break;
        }

    }
}
