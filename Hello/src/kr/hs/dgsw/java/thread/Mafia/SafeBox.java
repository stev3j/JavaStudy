package kr.hs.dgsw.java.thread.Mafia;

public class SafeBox {

    private int amount = 0;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {

        try {
            Thread.sleep(0, 1);
        } catch (InterruptedException e) { }

        this.amount = amount;
    }
}
