package 자바입출력실습;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class StdInputStream {
    private TreeSet<StudentInfo> treeSet;
    public StdInputStream() {
        this.treeSet = new TreeSet<>();
    }
    public void inPutStream(String fName) throws IOException {
        FileInputStream inputStream = new FileInputStream(fName);
        Scanner sc = new Scanner(inputStream);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            List<String> list = new ArrayList<>(Arrays.asList(line.split(" ")));
            int sum = 0;
            for(int i =1; i<list.size(); i++){
                sum +=Integer.parseInt(list.get(i));
            }
            this.treeSet.add(new StudentInfo(list.get(0),sum));
        }
        inputStream.close();
    }
    public TreeSet<StudentInfo> getTreeSet(){
        return treeSet;
    }
}