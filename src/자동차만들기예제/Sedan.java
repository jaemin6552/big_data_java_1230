package 자동차만들기예제;

public class Sedan extends Car{

    public Sedan(String name) {
        super(name);
        this.gas = 45;
        this.mileage = 12;
        this.seat = 4;
        this.speed = 200;
        count += seat;
        num++;
    }

    @Override
    void Addition(boolean TF) {
        seat += 1;
        count +=1;
    }
}
