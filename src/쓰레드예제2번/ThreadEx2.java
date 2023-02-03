package 쓰레드예제2번;



// 스레드 생성 방법 :
// - 상속을 받는 방법 (extends Thread) : 구현이 간편, 다른상속을 받지못함(자바는 다중상속을 허용x)
// - Runnable 인터페이스로 구현 : 다른 클래스의 상속을 받을 수 있음. 쓰레드 객체 만드는 과정이 필요
// - 익명의 객체로 구현 : 클래스 생성이 없이 간편하게 구현 할 수 있음
// - 익명의 객체를 람다식으로 구현
public class ThreadEx2 {
    public static void main(String[] args) {
        Thread cusTh = new CustomThread();

        Thread runTh1 = new Thread(new RunThread());
        Thread runTh = new Thread(new RunThread()); //쓰레드안에 구현해준 RunThread 인스턴스를 넣어줌

        //익명의 객체 생성
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i<=100; i++) System.out.printf("익명의 객체로 만든 라면의%d%%만큼 조리되었습니다\n",i);
            }
        };
        Thread taskTh = new Thread(task);

        //익명의 객체를 람다식으로 생성
        Runnable ram = () -> {
            for(int i = 1; i<=100; i++) System.out.printf("람다 객체로 만든 라면의%d%%만큼 조리되었습니다\n",i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread ramTh = new Thread(ram);


        ramTh.start();
        taskTh.start();
        runTh1.start();//내부적으로 run()메소드가 호출 됨
        runTh.start();
        cusTh.start();

        System.out.println("main입니다~");
        System.out.println("main입니다~");
        System.out.println("main입니다~");
        System.out.println("main입니다~");


    }
}
