package Math클래스;

import java.util.Arrays;

// Math 클래스의 모든 메소드는 클래스 메소드 이므로 객체를 생성하지 않고 바로 사용 함.
// random() : 0.0 ~ 1.0 미만의 임의의 double 형 값을 생성해서 반환
// 7자리의 로또 번호 생성하기
// 7개의 배열을 만들고 첫 번째 부터 여섯 번째는 0 ~ 50사이의 임의의 수 생성 후 대입
// 마지막 7번째는 50 ~ 100사이의 임의의 수를 만들어서 대입하고, 한번에 출력
public class MathMainEx {
    public static void main(String[] args) {
//        int []lottoNum = new int[7];
//        for(int i = 0; i<lottoNum.length-1; i++){
//            lottoNum[i] = (int)(Math.random()*51);
//            for(int j = 0; j<i; j++) {
//                if(lottoNum[i] == lottoNum[j]){
//                    i--;
//                }
//            }
//        }
//        lottoNum[lottoNum.length-1] = ((int)(Math.random()*51)+50);
//        System.out.println(Arrays.toString(lottoNum));
        // abs() 메소드 : 절대값 구하기, 양수면 양수, 음수면 양수
//        System.out.println(Math.abs(-30));
//        System.out.println(Math.abs(30));
//        System.out.println(Math.abs(-30.14));
        // floor() : 소수점 이하를 무조건 버림
        // ceil() : 소수점 이하가 있으면 무조건 올림
        // round() : 반올림 (소수점 첫째자리에서 반올림)
//        System.out.println(Math.floor(3.14));
//        System.out.println(Math.ceil(3.14));
//        System.out.println(Math.round(3.14));

        System.out.println(Math.max(11,9.00099));
        System.out.println(Math.min(11,9.00099));

        System.out.println( Math.pow(10,1));
    }
}
