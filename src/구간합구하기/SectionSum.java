package 구간합구하기;
import java.util.Scanner;
public class SectionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() + 1; //배열의 수
        int M = sc.nextInt(); //합을 구해야하는횟수
        int []sum = new int[N];
        for(int i = 1; i<N; i++) sum[i] = sum[i-1] + sc.nextInt(); //구해야할 구간을 만든다.
        for(int k = 0; k<M; k++){ //구해야할 구간을 받아서 연산
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(sum[j]-sum[i-1]);
        }
    }
}