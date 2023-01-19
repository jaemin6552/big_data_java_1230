package 자동차만들기예제;

public class Bus extends Car {


    public Bus(String name) {
        super(name);
        this.gas = 100;
        this.mileage = 5;
        this.seat = 20;
        this.speed = 150;
        count += seat;
        num++;
    }

    //만약에 온이되면 연료통이 30이 늘어남
    @Override
    void Addition(boolean TF) {
        this.gas +=30;
    }
}
