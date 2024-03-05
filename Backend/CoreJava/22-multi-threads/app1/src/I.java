import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class I {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean conditionMet = false;

    public void waitForCondition() throws InterruptedException {
        lock.lock();
        try {
            while (!conditionMet) {
                condition.await();
            }
            // Do something when the condition is met
            System.out.println(Thread.currentThread().getName()+ " did something!!!");
        } finally {
            lock.unlock();
        }
    }

    public void signalCondition() {
        lock.lock();
        try {
            conditionMet = true;
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        I example = new I();

        Thread thread1 = new Thread(() -> {
            try {
                example.waitForCondition();
                System.out.println(Thread.currentThread().getName()+" : Condition met");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                // Introduce delay to ensure thread 1 is waiting
                Thread.sleep(3000);
                example.signalCondition();
                System.out.println(Thread.currentThread().getName()+" : Signaled condition");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}
