package 클래스정렬연습문제;

public class StudentInfo implements Comparable <StudentInfo>{
    String name;
    int score;
    int number;

    static int rank = 1;

    public StudentInfo(String name, int score, int number) {
        this.name = name;
        this.score = score;
        this.number = number;

    }


    @Override
    public int compareTo(StudentInfo o) {
            if(this.score == o.score) {
                return this.number - o.number;
            }
            return o.score - this.score;


    }
}
