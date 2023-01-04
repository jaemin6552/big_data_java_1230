package 변수와데이터;

public class DataType {
    public static void main(String[] args) {
        //앞에 최상위 비트는 0이면 양수,1이면 음수로간주
        int num1, num2;
        double  num3 = 3.14;
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시" +minute + "분");
        NameCard nameCard = new NameCard();
        nameCard.name = "JM";
        nameCard.age = 28;
        nameCard.address ="서울";
        nameCard.eMail = "naver";
        nameCard.phoneNumber = "010";
    }
}

class NameCard {
    String name;
    int age;
    String address;
    String eMail;
    String phoneNumber;
}