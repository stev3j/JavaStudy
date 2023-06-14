package kr.hs.dgsw.java.thread;

public class DownThread extends Thread {

    @Override
    public void run() {
        for(int i = 100; i >= 1; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            System.out.printf("Sub - %d\n", i);
        }
    }
}
