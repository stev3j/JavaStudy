package kr.hs.dgsw.java.thread.Mafia;

public class Boss {

    private SafeBox safeBox = new SafeBox();

    public void startBusiness() {
        for (int i = 0; i < 10; i++) {
            Gang gang = new Gang(this, i);
            new Thread(gang).start();
        }
    }

    public int getAmount() {
        return safeBox.getAmount();
    }

    public void offer(int money, int id) {
        int amount = safeBox.getAmount();
        amount += money;
        safeBox.setAmount(amount);

        System.out.printf("조직원 %d가 %d원을 상납했다.\n", id, money);
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.startBusiness();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) { }

        System.out.printf("금고에는 지금 %d원이 들어있습니다.\n", boss.getAmount());
    }
}
