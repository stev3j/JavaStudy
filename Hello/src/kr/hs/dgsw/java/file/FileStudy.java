package kr.hs.dgsw.java.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStudy {

    public void studyFile() {
        File file = null;
        File file2 = null;

        file = new File("C:/Users/user/Desktop/[철수와 영희의 말싸움].txt");
        file2 = new File("C:/Users/user/Desktop/hello1.txt");

        System.out.printf("%s의 존재 여부 : %b\n", file.getName(), file.exists());
        System.out.printf("%s의 존재 여부 : %b\n", file2.getName(), file2.exists());

        File dir = new File("C:/Users/user/Desktop/");
        System.out.printf("%s는 디렉토리인가? : %b\n", dir.getName(), dir.isDirectory());
        System.out.printf("%s는 파일인가? : %b\n", dir.getName(), dir.isFile());

        for (int i = 0; i < 100; i++) {
            File subDir = new File(dir, "child" + i);
            subDir.delete();
        }

    }

    public void makeFile(String path, String fileName) throws IOException {
        File file = new File(path, fileName);
        System.out.printf("%s의 존재 여부 : %b\n", fileName, file.exists());

        file.createNewFile();

        System.out.printf("%s의 존재 여부 : %b\n", fileName, file.exists());
    }

    public void deleteFile(String path, String fileName) {
        File file = new File(path, fileName);
        System.out.printf("%s의 존재 여부 : %b\n", fileName, file.exists());

        file.delete();

        System.out.printf("%s의 존재 여부 : %b\n", fileName, file.exists());
    }

    public void printFileInformation(File file) {
        long size = file.length();
        System.out.printf("%s의 크기 : %d\n", file.getName(), size);

        long time = file.lastModified();
        Date data = new Date(time);
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.printf("%s의 마지막 수정 시각 : %s\n", file.getName(), dataFormat.format(data));
    }

    public void printFiles(File directory) {
        String[] names = directory.list();

        for (String name : names) {
            File file = new File(directory, name);
            System.out.printf("\t%s의 크기 : %d\n", name, file.length());
        }
    }

    public void printFile2(File directory) {
        File[] files = directory.listFiles();

        for (File file : files) {
            System.out.printf("\t%s의 크기 : %d\n", file.getName(), file.length());
        }
    }

//    public void printDirectory(File directory) {
//        File[] files = directory.
//    }

    public static void main(String[] args) throws IOException {
        FileStudy fileStudy = new FileStudy();
//        fileStudy.studyFile();

//        fileStudy.makeFile("C:/Users/user/Desktop/java_study", "java_file");
//        fileStudy.deleteFile("C:/Users/user/Desktop/java_study", "java_file");

//        File file = new File("C:/Users/user/Desktop/java_study", "java_text.txt");
//        fileStudy.printFileInformation(file);

//        File directory = new File("C:/Users/user/Desktop/java_study");
////        fileStudy.printFiles(directory);
//        fileStudy.printFile2(directory);

        File dir = new File("C:/Users/user");
        fileStudy.printFile2(dir);

    }
}
