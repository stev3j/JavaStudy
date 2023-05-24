package kr.hs.dgsw.java.exception;

import kr.hs.dgsw.java.inherit.plygon.Triangle;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsStudy {

    public void method1() {
        System.out.println("Method 1");
        method3();
    }

    public void method2() throws Exception {
        System.out.println("Method 2");
    }

    public void method3() throws NullPointerException {
        System.out.println("Method 3");
    }

    public static void main(String[] args) {
        ThrowsStudy study = new ThrowsStudy();
        study.method1();
    }
}
