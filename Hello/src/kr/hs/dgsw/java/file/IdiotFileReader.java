package kr.hs.dgsw.java.file;

import java.io.*;

public class IdiotFileReader {

    public byte[] readFile(File file) {
        long len = file.length();
        byte[] result = new byte[(int)len];
        InputStream is = null;

        try {
            is = new FileInputStream(file);
            int index = 0;

            while (index < len) {
                result[index] = (byte)is.read();
                index++;
            }

            return result;
        } catch (Exception e) {
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e) {
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        File file = new File("C:/Users/user/Desktop/java_study/java_text.txt");
        IdiotFileReader idiotFileReader = new IdiotFileReader();
        byte[] bytes = idiotFileReader.readFile(file);
        String str = new String(bytes);
        System.out.println(str);
    }
}
