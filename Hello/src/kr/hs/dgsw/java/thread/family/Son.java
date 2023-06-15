package kr.hs.dgsw.java.thread.family;

public class Son implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("후..잘잤다!");
    }

}
