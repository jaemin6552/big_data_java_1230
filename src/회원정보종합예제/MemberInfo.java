package 회원정보종합예제;

import java.util.Scanner;

//이름, 성별, 나이, 직업 받아서 출력 하기
public class MemberInfo { //필드와 메소드 가 있음
    //필드 추가하기 : 필드란? 클래스 내부에 있는 사용하는 변수를 의미 ( 객체 생성 시 객체 갯수 만큼 생성 됨)
//    public MemberInfo(String name,int age, char gender ,int jobs) {
//        this.age = age;
//        this.name = name;
//        this.jobs = jobs;
//        this.gender = gender;
//    }

    String name;
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);

    public void setName(){
        System.out.print("이름을 입력 하세요 : ");
        this.name = sc.next();
    }
    //주어진 조건에 맞는 나이를 입력 받아서 age 필드에 저장
    public void setAge(){
        while(true){
            System.out.print("나이를 입력 하세요 : ");
            this.age = sc.nextInt();
            if(age > 0 && age <200) return;
            System.out.println("잘못된 값입니다. 다시입력하세요 ");
        }
    }

    public void setGender(){

        while(true) {
            System.out.print("성별을 입력 하세요(M or F) : ");
            this.gender = sc.next().charAt(0);
            switch(gender){

                case 'm': case 'M': case 'f': case 'F':  return;
                default :
                    System.out.println("잘못입력하셨습니다 다시 입력하세요");
                    continue;
            }

        }
    }
//주어진 조건에 맞는 직업을 입력 받아서 jobs 필드에 저장
    public void setJobs() {
        while(true){
            System.out.print("직업을 입력 하세요(1.학생, 2.회사원, 3.주부, 4.무직) : ");
            jobs =sc.nextInt();
            if(jobs > 0 & jobs < 5) return;
            System.out.println("직업을 잘못 입력 하셨습니다.");
        }
    }
    public int getGenderType(){
        if(gender == 'm' || gender == 'M' ) return 1;
        else return 2;
    }
    public void viewInfo(){
        String[] genderStr = {"","남성","여성"};
        String[] jobStr = {"","학생","회사원","주부","무직"};
        System.out.println("===== 회원 정보 출력 =====");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + jobStr[jobs]);
    }
}
