package 클래스정렬연습문제;
//학생의 수를 입력 받기
//학생의 수만큼의 객체를 생성하여 정보를 입력(이름 성적 학번)
//학생의 성적이 높은 순으로 결과를 표시하고 성적이 같으면 학번 순으로 정렬
//그리고 출력시 등수가 표기 되도록 할 것
//[입력 예시]
//학생 수 입력 : 3
//안유진 99  202301
//정국 87 202302
//채연 88 202303

//[출력 예시]
//=====학생 성적 출력=======
//========================
//  석차  성적  이름  학번
//========================
//   1    99   안유진 202301


import java.util.TreeSet;
import static 클래스정렬연습문제.StudentInfo.rank;
public class ClassSortEx1 {
    public static void main(String[] args) {
        TreeSet <StudentInfo> stInfo = new TreeSet<>();
        stInfo.add(new StudentInfo("안유진",99,202301));
        stInfo.add(new StudentInfo("장원영",100,202302));
        stInfo.add(new StudentInfo("이서",91,202401));
        stInfo.add(new StudentInfo("리즈",95,202701));
        stInfo.add(new StudentInfo("레이",99,202303));
        System.out.println("=====학생 성적 출력=======");
        System.out.println("========================");
        System.out.println("  석차  성적  이름  학번   ");
        System.out.println("========================");
        for(StudentInfo e : stInfo) {
            System.out.printf("%d%5d%7s%10d\n",(rank++),e.score,e.name,e.number);
        }

    }
}
