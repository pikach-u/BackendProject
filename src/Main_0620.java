//0620 Thread

import java.util.Timer;

class MyThread extends Thread {      //Thread 상속
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("My Thread: " + i);
            try {
                Thread.sleep(5000);     // 예외처리 필수
            } catch (InterruptedException e) {  //.sleep()이 실행되는 동안 외부에서 작업이 들어올 수 있음
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Main_0620 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        thread.run();   // run을 직접 호출하면 멀티스레딩 X
    }
}