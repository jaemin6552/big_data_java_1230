package 큐예제2번;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 명령 이력 조회
public class QueueEx2 {
    final static int MAX_SIZE = 10;
    Queue<String> queue = new LinkedList<>();
    public static void main(String[] args) {

        QueueEx2 history = new QueueEx2();
        Scanner sc = new Scanner(System.in);
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while(true) {
            System.out.print("$ ");
            String cmd = sc.nextLine().trim();//입력의 앞뒤의 공백을 날림
            if(cmd.equalsIgnoreCase("q")){
                System.exit(0); // 프로그램을 강제 종료
            } else if(cmd.equalsIgnoreCase("help")){
                System.out.println("help - 도움말을 보여 줍니다.");
                System.out.println("q/Q - 프로그램 종료");
                System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                history.save(cmd);
            } else if(cmd.equalsIgnoreCase("history")) {
                history.save(cmd);
                int cnt = 0;
                for(String e : history.queue){
                    cnt++;
                    System.out.println(cnt + " " + e);
                }
            } else {
                    history.save(cmd);
                    System.out.println(cmd);
            }
        }

    }
     void save(String cmd) {
        queue.offer(cmd);
        if(queue.size() > MAX_SIZE)queue.remove(); //큐의 개수가 넘어가면 맨앞의 요소 제거
    }
}
