package 직렬화연습2번;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class SerialMenuRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        getMenuList();
    }
    static void getMenuList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("D:/직렬화파일/커피메뉴.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Map<String, CoffeeMenuInfo> map = (Map<String, CoffeeMenuInfo>) ois.readObject();
      //  map = (Map<String, CoffeeMenuInfo>) ois.readObject();
        System.out.println("<< 역직렬화해서 메뉴를 가져 옴 >>");
        for(String e : map.keySet()) {
            // get(key) : 키로 값으로얻어 옴
            System.out.println("메뉴 : " + map.get(e).getName());
            System.out.println("가격 : " + map.get(e).getPrice());
            System.out.println("분류 : " + map.get(e).getGroup());
            System.out.println("설명 : " + map.get(e).getDesc());
            System.out.println("-------------------------------------");
        }
        fis.close();
        ois.close();
    }
}

