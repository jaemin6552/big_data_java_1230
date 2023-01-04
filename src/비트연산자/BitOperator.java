package 비트연산자;
//비트 연산자 : 비트단위로 연산을 수행(1/0)
// & (비트 AND) : 두개의 비트가 모두 1이면 1
// | (비트 OR)  : 둘 중 한대의 비트만 1이면 1
// ^ (XOR)     : 두개의 비트의 값이 같으면 0, 다르면 1
// ~ (비트의 값을 반전) : 비트가 0이면 1, 1이면 0으로 변경
// << (shift 연산자) : 지정된 수만큼 왼쪽으로 비트를 이동 시킴
// >> (shift 연산자) : 지정된 수만큼 오른쪽으로 비트를 이동 시킴
public class BitOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 & num2); //8
        System.out.println(num1 | num2); //14
        System.out.println(num1 ^ num2); //6
        System.out.println(~num1); //-11
        System.out.println(num1 <<1); //20
        System.out.println(num1 >> 1); //5
    }
}
