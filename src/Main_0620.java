//0620 Thread

class Counter {
    private int count = 0;

    public synchronized void increment() {  // 경쟁 상황이 일어나는 메서드에 synchronized 키워드
        count++;
    }

    public int getCount() {
        return count;
    }
}


public class Main_0620 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }
        for(Thread t : threads)
        {
            t.join();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}