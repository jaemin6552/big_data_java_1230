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
            double isAvg = 0;
            System.out.print("학생수 입력 : ");
            student = sc.nextInt();
            int []score = new int[student];

            for(int j = 0; j<score.length; j++){
                System.out.printf("점수 입력: \r");
                score[j] = sc.nextInt();
                sum += score[j];
        }
            for(int e : score){
                if((double)sum / score.length < e){
                    isAvg++;
                }
            }
            System.out.printf("%.3f%%\n", isAvg / student * 100 );
        }
    }
}
