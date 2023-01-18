package 암호체크;

import java.util.Scanner;

//암호체크
//암호의 길이는 10~30자 사이 (10<= len <=30)
//암호에는 숫자, 소문자, 대문자, 특수 문자가 포함되어야 함
//특수문자는(!,%,_,#,&,+,-,*,/)의 9개 중의 하나
//입력 받은 패스워드가 조건을 만족하면 "Good password", 만족하지않으면 "bad password"출력
//반복문을 사용하고 사용자가 "종료" 또는 "exit"를 입력하면 프로그램 종료
public class PwdCheckMain {
    public static void main(String[] args) {
        String password;
        boolean isNum = false;
        boolean isLower = false;
        boolean isUpper = false;
        boolean isSp = false;
        String special = "!%_#&+-*/";
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("암호입력 : ");
            password = sc.nextLine();
            if (password.equalsIgnoreCase("종료") || password.equalsIgnoreCase("exit")) break;
            if (password.length() >= 10 && password.length() <= 30) {
                for (int i = 0; i < password.length(); i++) {
                    for(int j = 0; j < special.length(); j++){
                        if(password.charAt(i) == special.charAt(j)) isSp = true;
                    }
                    //숫자 구분 케이스
                    if (password.charAt(i) >= 48 && password.charAt(i) <= 57) isNum = true;
                    //대문자 구분 케이스
                    if (password.charAt(i) >= 65 && password.charAt(i) <= 90) isUpper = true;
                    //소문자 구분 케이스
                    if (password.charAt(i) >= 97 && password.charAt(i) <= 122) isLower = true;
                }
            } else {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
            if (isNum && isUpper && isLower && isSp) {
                System.out.println("Good password");
            } else {
                System.out.println("Bad password");
            }
            isNum = false;
            isLower = false;
            isSp = false;
            isUpper = false;
        }

    }


}
