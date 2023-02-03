package 쓰레드예제6번;

import static java.lang.System.*;

// 스레드의 안전한 종료 방법은 stop 플래그를 구현하는 방법과 interrupt()메소드를 사용하는 방법이 있습니다.
public class ThreadEx6 {
    public static void main(String[] args) throws InterruptedException {
//        RunThread runThread = new RunThread();
//        runThread.start();
//        Thread.sleep(10000);
//        runThread.setStop(true);

        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
       // Thread.sleep(10000);
       // interruptThread.interrupt(); //일시 정지 상태의 쓰레드에 InterruptException 발생 시킴

    }
}
