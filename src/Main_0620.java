//0620 Thread

import java.util.Timer;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable 실행중");

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Main_0620 {
    public static void main(String[] args) {
//        Thread thread = new Thread(new MyRunnable(), "CountThread");
////        thread.setName("CountThread");
//        thread.start();

        new Thread(() -> {      //람다로 변경
            System.out.println("Runnable 실행 중");

            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(5000);

                    System.out.println(i);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }).start();
    }
}
