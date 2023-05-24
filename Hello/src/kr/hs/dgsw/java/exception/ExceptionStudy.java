package kr.hs.dgsw.java.exception;

public class ExceptionStudy {
    public void nullMethod() {
        String name = null;
        int length = name.length();
    }

    public static void main(String[] args) {
        ExceptionStudy exception = new ExceptionStudy();
        exception.nullMethod();
    }
}
