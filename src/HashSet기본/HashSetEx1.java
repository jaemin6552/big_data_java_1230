package HashSet기본;
import java.util.Arrays;
import java.util.HashSet;

// HashSet : 순서를 보장하지 않으며 중복 값을 허용하지 않습니다.
// 중복 여부 확인은 hashCode()의 리턴값을 이용 합니다. (경우에 따라 오버라이딩 합니다.)
public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet<Member> set = new HashSet<>();
        set.add(new Member(1003,"유나"));
        set.add(new Member(1004,"원영"));
        set.add(new Member(1005,"레이"));
        Member mem4 = new Member(1006,"리즈");
        set.add(mem4);
        set.add(new Member(1003,"이서"));

        for(Member e : set) {
            e.showMember();
            System.out.println(e.hashCode());
            System.out.println("===============");
        }
    }
}

class Member {
    Integer id;
    String name;
    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member = (Member) obj;
            if(id.hashCode() == member.hashCode()) return true;
            else return false;
        }
        return false;
    }
    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void showMember(){
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);

    }
}
