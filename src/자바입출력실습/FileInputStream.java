package 자바입출력실습;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class FileInputStream {
    private TreeSet<StudentInfo> treeSet = new TreeSet<>();

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
           int sum = 0;
           sum = (Integer.parseInt(list.get(1))+Integer.parseInt(list.get(2))+Integer.parseInt(list.get(3));
           this.treeSet.add(new StudentInfo(list.get(0),sum));
       }
       inputStream.close();

   }
   public TreeSet<StudentInfo> getTreeSet(){
       return treeSet;
   }
}
