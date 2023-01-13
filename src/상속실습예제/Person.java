package 상속실습예제;
// Person 클래스 생성
// - age : 나이 특성을 가짐 (정수 값 사용, 게터/세터 사용) = 몇살?
// - sleep : 잠자는 특성 (정수 값 사용, 게터/세터 사용) = 몇시간 잠자는지?
// 인간으로 부터 직장인을 생성
// - work : 몇 시간 일하는지? (정수, 게터/세터)
// 인간으로 부터 학생을 생성
// - study : 공부하는 특성 (1 입력 "열심히",2 "적당히", 3"놀면서")
public class Person {
    private int age;
    private int sleep;
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    void setSleep(int sleep) {
        this.sleep = sleep;
    }
    int getSleep(){
        return sleep;
    }
    void showInfo(){
        System.out.println("나이는 : " + getAge());
        System.out.println("자는시간 : " + getSleep());
    }
}

class Worker extends Person{

    private int work;
    void setWork(int work){
        this.work = work;
    }
    int getWork() {
        return work;
    }
    @Override
    void showInfo(){
        System.out.println("나이는 : " + getAge());
        System.out.println("자는시간 : " + getSleep());
        System.out.println("일하는 시간 : " + getWork());
    }
}
class Student extends  Person{
    private int study;

    void setStudy(int study){
        this.study = study;
    }
    int getStudy(){
        return study;
    }
    @Override
    void showInfo(){
        System.out.println("나이는 : " + getAge());
        System.out.println("자는시간 : " + getSleep());
        switch (getStudy()){
            case 1 : System.out.println("열심히 공부합니다.");
            break;
            case 2 : System.out.println("적당히 공부합니다.");
            break;
            case 3 : System.out.println("놀면서 공부합니다.");
            break;
        }
    }
}
