package 프로퍼티;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

// 키와 값이 모두 String타입으로 제한된 Map컬렉션이며, HashTable 에서 상속받았습니다.
// 주로 문자열로 이루어진 파일에서 정보를 읽을 때 사용 합니다.
public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties(); //HashTable 에서 상속 받음
        String path = PropertiesEx.class.getResource("../회원정보종합예제/database.properties").getPath();// ./는 현재위치 ../는 상위 폴더로 이동
        path = URLDecoder.decode(path, "utf-8"); //한글이 포함되는 경우를 해석하기 위한 코드
        properties.load(new FileReader(path)); //
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("drive : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
