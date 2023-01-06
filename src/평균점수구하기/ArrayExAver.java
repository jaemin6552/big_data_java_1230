package 평균점수구하기;

import java.util.Scanner;

//상현이가 가르치는 학생은 총 5명(안유진, 유나, 채원, 나카무라, 장원영)
//기말고사를 치고 난후 성적이 40점 미만인 경우 보충학습을 듣는 조건으로 성적을 조정 해줌
//모든 학생이 보충학습을 들음.
//총 수강생의 평균을 구하는 프로그램 작성
public class ArrayExAver {
    public static void main(String[] args) {
        int []score = new int[5];

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i<score.length; i++){
            System.out.print("성적을 입력하세요 : ");
            score[i] = sc.nextInt();
            if(score[i] < 40 ){
                score[i]  = 40;
            }
            sum += score[i];
        }
        int avg = (sum / score.length);
        System.out.println("학생들 평균 : " + avg);

    }
}
class Student {

    String name;
    int score;
}
