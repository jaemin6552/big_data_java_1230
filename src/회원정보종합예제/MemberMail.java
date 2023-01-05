package 회원정보종합예제;

public class MemberMail {
    public static void main(String[] args) {
        MemberInfo info =new MemberInfo(); //MemberInfo 클래스 객체로 만듬
        info.setName(); //이름을 저장하는 메소드 호출
        info.setAge(); //나이를 저장하는 메소드 호출
        info.setGender(); //성별을 저장하는 메소드 호출
        info.setJobs(); //

        info.viewInfo();
    }
}

