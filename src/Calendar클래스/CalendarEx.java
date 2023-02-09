package Calendar클래스;

import java.util.Calendar;
import java.util.LinkedList;

// Calender 클래스는 추상클래스이므로 객체 생성없이 사용, 날짜와 시간과 달리 캘린더 표기법은 각 나라마다 상이 하기 때문
// 정적메소드인 getInstance() 메소드 이용해서 운영체제의 시간 기준을 가져옴, 포함된 필드도 전부 클래스 변수
public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); //Date now = new Date();
        System.out.println(now.get(Calendar.YEAR));

//        System.out.println(now.get(Calendar.MONTH) + 1);
//        System.out.println(now.get(Calendar.AM_PM));
//        System.out.println(now.get(Calendar.MONTH) + 1);
//        System.out.println(now.get(Calendar.AM_PM));
//        System.out.println(now.get(Calendar.DAY_OF_WEEK) + 1);
        // yyyy년MM월dd HH시mm분ss초 :
        System.out.printf("%d년%d월% d시%d분%d초",now.get(Calendar.YEAR),now.get(Calendar.MONTH) + 1 ,now.get(Calendar.HOUR),now.get(Calendar.MINUTE),now.get(Calendar.SECOND));
        System.out.println();
        LinkedList<Integer> lkList = new LinkedList<>();
        lkList.push(5);
        lkList.add(3);
        lkList.push(10);
        lkList.add(7);
        //lkList.pop();
        for(Integer e : lkList){
            System.out.println(e);
        }


        lkList.remove(0);

    }
}
