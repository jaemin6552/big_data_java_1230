package 자바입출력실습;


public class StudentInfo implements Comparable<StudentInfo>{
    private String name;
    private int sum;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSum(int kor, int eng, int math) {
        sum = kor + eng + math;
    }

    public int getSum(){
        return sum;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if(this.getSum() == o.getSum()){
            return this.getName().compareTo(o.getName());
        }
        return o.sum-this.sum;
    }
}
