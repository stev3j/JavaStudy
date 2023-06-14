package kr.hs.dgsw.java.thread;

public class SecDownThread extends Object implements Runnable{

    @Override
    public void run() {
        for(int i = 100; i >= 1; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            System.out.printf("Sub2 - %d\n", i);
        }
    }

}
