package 입출력예제;

import java.util.Scanner;

public class SystemInOut {
    public static void main(String[] args) {
        String name = "JM";
        String addr = "Korea Seoul";
        char gender = '남';
        int age = 28;
        int kor = 99;
        int eng = 88;
        int mat = 99;
        double aver = 0.0;
        // 자바 스타일 (mathod를 오버로딩 하는 방식)
        System.out.println("========= Java Style Output =========");
        System.out.print("Name : " + name + "\n");
        System.out.println("addr : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor+eng+mat));
        System.out.println("평균 : "+ ((double)(kor+eng+mat)/3));
        // c언어 스타일(서식지정자를 사용)
        // 서식지정자 : %d, %ld , %u , %f, %.2f , %s, %c ,%% , %b
        // escape시퀀스 : \n, \r ,\t , \b
        System.out.printf("========= Java Style Output =========\n");
        System.out.printf("이름 : %s, 주소 : %s\n", name,addr);
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor+eng+mat);
        System.out.printf("평균 : %.2f\n", ((double)kor+eng+mat)/3);

        System.out.printf("Apple\rBanana\tkiwi\b\b\n");
        System.out.println("\"Enter\"키를 입력 하시면 종료 됩니다.");
        System.out.println("hello\\java");
        System.out.printf("오늘의습도는 %d%%\n",25);

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        for(int i = 1; i<= n *n ; i++){
            System.out.printf("%4d",i);
            if(i % n ==0 ) System.out.println();
        }
    }
}
