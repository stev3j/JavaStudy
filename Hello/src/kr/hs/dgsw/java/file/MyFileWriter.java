package kr.hs.dgsw.java.file;

import kr.hs.dgsw.java.exception.MyFileReader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class MyFileWriter {

    public void write(File file, String content) {
        OutputStream os = null;

        try {
            os = new FileOutputStream(file);
            byte[] bytes = content.getBytes(); // toByte

            os.write(bytes);
            os.flush();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e) {}
            }
        }
    }

    public void append(File file, String content) {
        OutputStream os = null;

        try {
            os = new FileOutputStream(file);
            byte[] bytes = content.getBytes(); // toByte

            os.write(bytes);
            os.flush();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e) {}
            }
        }
    }

    public static void main(String[] args) {
        MyFileReader fileReader = new MyFileReader();
        File file = new File("C:/User/user/Desktop/java_study/java_text.txt");

//        fileReader.write(file, "안녕하세요?");
//        fileReader.append(file, "...");


    }
}
