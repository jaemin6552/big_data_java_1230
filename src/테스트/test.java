package 테스트;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Member> arrayList = new ArrayList<>();
        arrayList.add(new Member(30,"jm"));
        arrayList.add(new Member(50,"jm"));
        arrayList.add(new Member(70,"jm"));

        for(Member e : arrayList){
            System.out.println(e.id + " " + e.name);

        }
    }
}
class Member {
    int id;
    String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
}