package 입출력스트림예제5번;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InOutStreamEx5 {
    public static void main(String[] args) throws IOException {
        String originalFileName = "src/입출력스트림예제5번/cat.jpg";
        String targetFileName = "D:/clone_0209.jpg";

        FileInputStream fis = new FileInputStream(originalFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        int cnt = 0;
        byte[] buffer = new byte[100];
        while((readByteNo = fis.read(buffer))!= -1){
            fos.write(buffer,0,readByteNo);
            System.out.println("버퍼 카운트 : " + (++cnt));
        }
        fos.close();
        fos.flush();
        fis.close();
    }
}
