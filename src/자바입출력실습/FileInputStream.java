package 자바입출력실습;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class FileInputStream {
    private TreeSet<StudentInfo> treeSet = new TreeSet<>();
    private StudentInfo studentInfo;
   public void inPutStream( String fName) throws IOException {
       java.io.FileInputStream inputStream = null;

       try {
           inputStream = new java.io.FileInputStream(fName);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       Scanner sc = new Scanner(inputStream);
       while(sc.hasNextLine()){
           String line = sc.nextLine();
           List<String> list = new ArrayList<>(Arrays.asList(line.split(" ")));
           studentInfo = new StudentInfo();
           studentInfo.setName(list.get(0));
           studentInfo.setSum(Integer.parseInt(list.get(1)),Integer.parseInt(list.get(2)),Integer.parseInt(list.get(3)));
           this.treeSet.add(studentInfo);
       }
       inputStream.close();

   }
   public TreeSet<StudentInfo> getTreeSet(){
       return treeSet;
   }
}
