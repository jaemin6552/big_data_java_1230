package 자바입출력메인버전;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class InOutMain {
    public static void main(String[] args) throws IOException {
        TreeSet<StudentInfo> set = new TreeSet<>();
        FileInputStream fileInputStream = new FileInputStream("test.txt");
        Scanner sc = new Scanner(fileInputStream);
        while(sc.hasNextLine()){
            String tmp = sc.nextLine();
            List<String> list = new ArrayList<>(Arrays.asList(tmp.split(" ")));
            int sum =0;
            for(int i = 1; i<list.size(); i++) {
                sum += Integer.parseInt(list.get(i));
            }
            set.add(new StudentInfo(list.get(0),sum));
        }
        fileInputStream.close();
        for(StudentInfo e : set){
            System.out.print(e.getName() +" ");
            System.out.println(e.getSum());
        }
    }
}
