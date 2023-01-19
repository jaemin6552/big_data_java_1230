package 자동차만들기예제;

public abstract class Car {
    int speed;
    int gas;
    int mileage;
    int seat;
    String name;
    static int count = 0;
    static int num = 0;

    public Car(String name){
        this.name = name;
    }

    abstract void Addition(boolean TF);
    public void GetInfo(int dist){
                System.out.println(dist / mileage  * 2000 * num + "원");
                System.out.println("이동횟수 : " + num);
                if(dist % gas == 0) System.out.println("주유횟수 : " + dist / gas * num + "번");
                else System.out.println("주유횟수 : " + (dist / gas * num + 1 )+ "번");
                System.out.printf("%.2f시간\n",(double) dist / speed * num);
                System.out.println(this.name);
        }


}


