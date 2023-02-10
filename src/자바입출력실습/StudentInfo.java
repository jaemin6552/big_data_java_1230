package 자바입출력실습;
public class StudentInfo implements Comparable<StudentInfo>{
    private String name;
    private int sum;
    public StudentInfo(String name,int sum){
        this.name =name;
        this.sum = sum;
    }
    public String getName() {
        return name;
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




