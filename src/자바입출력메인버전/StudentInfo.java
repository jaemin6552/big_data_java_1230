package 자바입출력메인버전;

public class StudentInfo implements Comparable<StudentInfo>{
    int sum;
    String name;
    StudentInfo(String name, int sum){
        this.name = name;
        this.sum = sum;
    }
    public int getSum() {
        return sum;
    }
    public String getName() {
        return name;
    }
    @Override
    public int compareTo(StudentInfo o) {
        if(this.sum == o.sum) return this.name.compareTo(o.name);
        return o.sum - this.sum;
    }
}
