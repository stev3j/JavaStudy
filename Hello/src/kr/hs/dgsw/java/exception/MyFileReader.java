package kr.hs.dgsw.java.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyFileReader {

    public String readString(String filePath) {
        FileInputStream is = null;
        try {
            File file = new File(filePath);
            is = new FileInputStream(file);

            String result = "";
            String str = null;
            int length = 0;
            byte[] buffer = new byte[1024];

            while ((length = is.read(buffer)) > 0) {
                str = new String(buffer, 0, length);
                result += str;
            }
            System.out.println("check 1");

            return result;
        } catch (Exception e) {
            System.out.println("check 2");
            throw new RuntimeException(e.getMessage(), e);
        } finally { // 끝내기 전에 수행
            System.out.println("check 3");
            if (is != null) {
                try { is.close(); } catch (IOException ex) { throw new RuntimeException(ex); }
            }
        }
    }

    public static void main(String[] args) {
        MyFileReader fileReader = new MyFileReader();
        fileReader.readString(null);

    }
}
