package 스트림예제2번;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("JM",92));
        list.add(new Student("구동매",80));

        list.parallelStream().forEach(p->{ //병렬과 직렬 어떤걸로 할것인지는 직접 알아보자
            String name = p.getName();
            int score = p.getScore();
            System.out.println(name + "-" + score);
        });
        double avg = list.stream().mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println("평균 점수 : " + avg);


    }
}

class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}