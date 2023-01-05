package 주사위게임;
// 주사위 2개를 던져서 합 12이면 탈출하는 게임
public class DiceGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int count = 0;
        while(true){
            rand1 = (int)((Math.random() *6) + 1); //랜덤 함수는 실수형으로 값이 생성되므로 형변환이 필요.
            rand2 = (int)((Math.random() *6) + 1);
            count ++;
            if( ( rand1 + rand2) == 12) {
                System.out.printf("무인도 %d 회 만에 탈출합니다." , count);
                break;
            } else {
                System.out.println("주사위의 합이 " + (rand1+rand2) + " 입니다 ");
            }

        }
    }
}
