package kr.hs.dgsw.java.thread.family;

public class Mother {

    public static void main(String[] args) {

        Son son = new Son();
        Thread thread = new Thread(son);
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

        thread.interrupt();
    }

}
