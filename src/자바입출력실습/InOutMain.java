package 자바입출력실습;

import java.io.IOException;
public class InOutMain {
    public static void main(String[] args) throws IOException {
        StdInputStream stdInputStream = new StdInputStream();
        stdInputStream.inPutStream("test.txt");

        for(StudentInfo o : stdInputStream.getTreeSet()){
            System.out.print(o.getName() + " ");
            System.out.println(o.getSum());
        }
    }
}