package 자동차만들기예제;

import java.util.Scanner;

import static 자동차만들기예제.Car.count;


public class CarMain {

    public static void main(String[] args) {
        int local;
        int people;
        int witchCar;
        int add; //부가기능
        final int []distance = {0,400,200,150,300}; //(1. 부산, 2. 대전, 3. 강릉, 4. 광주)

        Car car = null;
        //부산 400km, 강릉 200km, 대전 150km,  광주 300km
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역을 선택 하세요 [1]부산, [2]대전, [3]강릉, [4]광주 : ");
        local = sc.nextInt();
        System.out.print("이동할 승객 수를 입력 하세요");
        people = sc.nextInt();
        System.out.println("이동 차량을 선택 하세요 [1]스포츠카 [2]승용차 [3]버스 : ");
        witchCar = sc.nextInt();
        System.out.println("부가기능 여부를 선택해주세요[1]O [2]X : ");
        add = sc.nextInt();

        while (count < people) {
            switch (witchCar) {
                case 1:
                    car = new SportsCar("부가티");
                    break;
                case 2:
                    car = new Sedan("아반떼");
                    break;
                case 3:
                    car = new Bus("타요");
                    break;
                default:
            }
            if (add == 1)
                car.Addition(true);
        }
        car.GetInfo(distance[local]);
    }
}
