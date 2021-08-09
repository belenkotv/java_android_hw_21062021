package hw13;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {

    private Semaphore sync;

    public Tunnel(int permits) {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
        this.sync = new Semaphore(permits, true);
    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                sync.acquire();
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);
                sync.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
