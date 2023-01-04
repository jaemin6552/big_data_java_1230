package 조건문연습문1;

import java.util.Scanner;

//성적을 입력 받음
//입력 받은 값이 0~100사이가 아니면 "잘못"입력 하였습니다" 출력
//90점 이상이면 A, 80점 이상이면 B, 70점이상이면 C,60점이상이면 D, 나머지는 F
public class ScoreGrade {
    public static void main(String[] args) {
        //스캐너 객체 생성
        //생성된 객체에서 정수값 입력 받음
        //조건문 값이 0과 100사이인 경우 해당 학점 출력
        boolean bt = true;
        Scanner sc = new Scanner(System.in);
        while(bt) {
            System.out.print("점수를 입력하세요 : ");
            int grade = sc.nextInt();
            if(grade <0 || grade >100) {
                System.out.println("잘못된 입력 값입니다.");
                bt = false;
            }else if (grade >= 90) {
                System.out.println("점수는 : " + grade + " A등급 입니다");
            } else if (grade >= 80) {
                System.out.println("점수는 : " + grade + " B등급 입니다");
            } else if (grade >= 70) {
                System.out.println("점수는 : " + grade + " C등급 입니다");
            } else if (grade >= 60) {
                System.out.println("점수는 : " + grade + " D등급 입니다");
            } else{
                System.out.println("점수는 : " + grade + " F등급 입니다");
            }
        }
    }
}
