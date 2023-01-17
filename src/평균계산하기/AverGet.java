package 평균계산하기;

import java.util.Scanner;

public class AverGet {
    public static void main(String[] args) {
        int count; //케이스
        int student;

        Scanner sc =new Scanner(System.in);
        System.out.print("케이스 입력: ");
        count = sc.nextInt();
        for(int i = 0; i<count; i++){
            int sum =0;
            int isAvg = 0;
            System.out.print("학생수 입력 : ");
            student = sc.nextInt();
            int []score = new int[student];

            for(int j = 0; j<score.length; j++){
                System.out.print("점수 입력: ");
                score[j] = sc.nextInt();
                sum += score[j];
        }
            for(int k = 0; k <score.length; k++){
                if((double)sum / score.length < score[k]){
                    isAvg++;
                }
            }
            System.out.printf("%.3f%%\n", ((double)isAvg / student) * 100 );
        }
    }
}
