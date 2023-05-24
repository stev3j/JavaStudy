package kr.hs.dgsw.java.exception;

public class MyExceptionTester {

    public void method1(String name) {
        try {
            method2(name);
        } catch (MyException e) {
            throw new RuntimeException(e);
        }
    }

    public void method2(String name) throws MyException {
        if (name != null) {
            System.out.printf("Hello %s\n", name);
        } else {
            throw new MyException();
        }
    }

    public static void main(String[] args) {
        MyExceptionTester tester = new MyExceptionTester();
        tester.method1(null);
    }
}
