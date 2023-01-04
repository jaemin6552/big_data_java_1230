package 타입변환;
// 타입 변환이란 ? 하나의타입을 다른 타입으로 변경 하는 것
// 묵시적 형변환(Auto) : 컴파일러가 유리한 방향으로 형을 변경해주는 것
// 명시적 형변환 : 개발자가 의도한대로 형변환을 하는 것
// 메소드를 이용한 형변환 : Integer.parseInt(); 문자열을 정수 타입으로 변경
// Double.parseDouble 문자열을 실수 타입으로 변경
// 진수 표현 :  16진수,10진수,8진수,2진수
public class TypeEx1 {
    public static void main(String[] args) {
//        int num1 = 1, num2 = 4;
//        double rst1 = num1 /num2;
//        double rst2 = (double)num1 /num2; //명시적 형변환과 묵시적 형변환이 일어남
//        double rst3 = 100 + 100.1;
//        System.out.println(rst1);
//        System.out.println(rst2);
//        System.out.println(rst3);
//
//        String phoneNumber = "01012345678";
//        String name ="JM";
//
//        double number = Double.parseDouble(phoneNumber);
//        System.out.println(number);
        int var1 = 0b1010; //2진수 10
        int var2 = 0267; // 8진수
        int var3 = 399; // 10진수
        int var4 = 0x100abd; //16진수
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }
}
