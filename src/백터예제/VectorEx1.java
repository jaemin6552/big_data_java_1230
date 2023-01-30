package 백터예제;

import java.util.Arrays;
import java.util.Vector;
import java.util.List;

// Vector는 ArrayList 내부적으로 동일한 구조입니다. 메소드의 사용 방법도 완전히 동일 합니다. 멀티스레드에 안전 합니다.
public class VectorEx1 {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("jm","1234-5678","naver.com","부장","수원"));
        list.add(new NameCard("KJM","1234-5555","dawm.com","과장","인천"));
        list.add(new NameCard("KJJ","1234-6666","naver.com","대리","부산"));
        for(NameCard e : list){
            System.out.println("이름 : " +  e.name);
            System.out.println("전화번호 : " +  e.phone);
            System.out.println("메일 : " +  e.mail);
            System.out.println("직급 : " +  e.position);
            System.out.println("주소 : " +  e.address);


        }

    }
}
class NameCard{
    String name;
    String phone;
    String mail;
    String position;
    String address;

    public NameCard(String name, String phone, String mail, String position, String address) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.position = position;
        this.address = address;
    }
}
