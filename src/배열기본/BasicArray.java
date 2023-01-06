package 배열기본;

public class BasicArray {
    public static void main(String[] args) {
        int[] score = new int[3]; //타입[] 참조변수 = new 타입[크기];
        int sum = 0;
        score[0] = 90;
        score[1] = 88;
        score[2] = 70;

        for(int i = 0; i < score.length; i++){
            sum += score[i];
        }
        System.out.println("총 점 : " + sum);
        System.out.printf("평 균 : %f \n" , ((double)sum/score.length));
    }
}
