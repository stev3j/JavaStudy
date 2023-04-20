package kr.hs.dgsw.java.startpackage;


import java.util.Scanner;

public class ScannerStudy {

    // java.lang
//    String str = null;
//    Integer intValue = null;
//    System system = null;

    // java.util : import 해야함.
    private Scanner scanner = null;

    private void prepareScanner() {
        this.scanner = new Scanner(System.in);
    }

    public void testRead() {
        String str = null;
        str = this.scanner.next(); //사용자의 입력을 기다림
        System.out.println("출력: " + str);
    }

    private void closeScanner() {
        this.scanner.close();
    }

    public static void main(String[] args) {
        ScannerStudy object = new ScannerStudy();
        object.prepareScanner();
        object.testRead();
        object.closeScanner();
    }


}
