package kr.hs.dgsw.java.exception;

import java.io.*;

public class FileStudy {

    public String readFile(String filePath) {
        try {
            File file = new File(filePath);

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            String result = "";

            while ((line = bufferedReader.readLine()) != null) {
                result += line;
            }
            return result;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String readFile2(String filePath) throws IOException {
        File file = new File(filePath);

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        String result = "";

        while ((line = bufferedReader.readLine()) != null) {
            result += line + "\n";
        }

        return result;
    }
}
