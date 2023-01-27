package System클래스;

import static java.lang.Thread.sleep;

//경과 시간 측정 하기
public class SystemMain {
    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[1000];
        int cnt = 0;
        int val = (int)(Math.random()*1000)+1; //1 ~ 1000 사이의 임의의 값
        for(int i = 0; i < data.length; i++){ // 1000개의 배열에 1부터 1000까지의 값을 저장
            data[i] = i + 1;
        }
        long time = System.nanoTime();
        long time1 = System.currentTimeMillis(); //측정위한 시작 시간 가져옴 1970년 1월1일부터 지금까지
        for(int i = 0; i < data.length; i++){
            cnt++;
            Thread.sleep(1); // 시간 측정에 대한 지연 요인을 만들기 위해서 인위적으로 추가
            if(val == data[i]){
                System.out.println("위치 : " + (i+1));
                break;
            }
        }
        long time2 = System.currentTimeMillis(); // 측정을 위한 종료 시간 가져 옴
        System.out.println("총 검색 횟수 : " + cnt + ",걸린시간 : " + (time2-time1));

        //시스템 프로퍼터 읽기
        System.out.println(System.getProperty("os.name")); //os.name 키값을 넣으면 해당 정보를 반환
        System.out.println(System.getProperty("time"));
    }

}
