package 스트링버퍼;

import java.util.Arrays;

// StringBuffer : 객체 생성 후 사용, 문자열 추가 시 기존의 문자열이 수정 됨, 동기화(멀티쓰레드) 지원
// StringBuilder : 객체 생성 후 사용, 문자열 추가 시 기존 문자열이 수정 됨, 동기화 지원 안됨, 성능은 우수
// String : 객체 생성 필요 없음, 문자열 추가 시 계속 새로운 문자열이 만들어 짐, 문자열 추가가 길어 지면 성능 저하
// append() : 문자열을 추가 할 때 사용
// insert() : 특정 위치에 문자열을 삽입
// delete() : 위치를 정해 삭제함
// substring() : 문자열을 구간을 정해 잘라 냄
public class StringBufferMain {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuffer sf = new StringBuffer();

        sb.append("hello");
        sb.append(' ');
        sb.append("Python");
        sb.insert(0,"안녕하세요 ");
        //sb.delete(0,6); //앞에 인자는 해당위치 두번째 인자는 해당위치미만 0~5까지

        System.out.println(sb);
        System.out.println(sb.substring(6));
        System.out.println(sb.substring(0,6));
//        String st = "hello";
//        st += " ";
//        st += "to java";
//        st += " ";
//        st += "c";
//        System.out.println(st);
    }
}
