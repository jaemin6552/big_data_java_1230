package 쓰레드예제2번;

public class RunThread implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i<=100; i++) System.out.printf("Runnable 구현으로 만든 라면의%d%%만큼 조리되었습니다\n",i);
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
