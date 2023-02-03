package 쓰레드예제2번;

public class CustomThread extends Thread{
    @Override
    public void run() { //쓰레드가 실행되는 부분
        for(int i = 1; i<=100; i++) System.out.printf("Thread 상속으로 만든 라면의%d%%만큼 조리되었습니다\n",i);
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
