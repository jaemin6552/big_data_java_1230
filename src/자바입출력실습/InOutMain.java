package 자바입출력실습;

import java.io.IOException;

public class InOutMain {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream();
        fileInputStream.inPutStream("test.txt");

        for(StudentInfo o : fileInputStream.getTreeSet()){
            System.out.println(o.getName());
            System.out.println(o.getSum());
        }
    }
}
