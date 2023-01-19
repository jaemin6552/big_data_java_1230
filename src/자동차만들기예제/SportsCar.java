package 자동차만들기예제;

public class SportsCar extends Car{

    public SportsCar(String name) {
        super(name);
        this.gas = 30;
        this.mileage = 8;
        this.seat = 2;
        this.speed = 250;
        count += seat;
        num ++;
    }

    @Override
    void Addition(boolean TF) {
        this.speed *= 1.2;
    }
}

