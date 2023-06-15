package kr.hs.dgsw.java.thread.Mafia;

public class Gang implements Runnable{

    private final Boss boss;
    private final int id;

    public Gang(Boss boss, int id) {
        this.boss = boss;
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            boss.offer(1, id);
        }
        System.out.printf("조직원 %d 임무완료!", id);
    }
}
