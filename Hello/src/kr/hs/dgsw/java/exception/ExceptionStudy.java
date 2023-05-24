package kr.hs.dgsw.java.exception;

public class ExceptionStudy {
    public void nullMethod() {
        String name = null;
        int length = name.length();
    }

    public int divide(int op1, int op2) {
        try {
            return op1/op2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("0으로 나눌 수 없어요~");
            return 0;
        }
    }

    public static void main(String[] args) {
        ExceptionStudy exception = new ExceptionStudy();
//        exception.nullMethod();
        exception.divide(5, 0);
    }
}
