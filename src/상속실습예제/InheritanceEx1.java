package 상속실습예제;
// Person 클래스 생성
// - age : 나이 특성을 가짐 (정수 값 사용, 게터/세터 사용) = 몇살?
// - sleep : 잠자는 특성 (정수 값 사용, 게터/세터 사용) = 몇시간 잠자는지?
// 인간으로 부터 직장인을 생성
// - work : 몇 시간 일하는지? (정수, 게터/세터)
// 인간으로 부터 학생을 생성
// - study : 공부하는 특성 (1로 입력 "열심히",2 "적당히", 3"놀면서")
public class InheritanceEx1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(28);
        person.setSleep(8);
        person.showInfo();

        System.out.println();

        Worker worker = new Worker();
        worker.setAge(27);
        worker.setSleep(6);
        worker.setWork(9);
        worker.showInfo();

        System.out.println();

        Student student = new Student();
        student.setAge(18);
        student.setSleep(6);
        student.setStudy(1);
        student.showInfo();

    }


}
