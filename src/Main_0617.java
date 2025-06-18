//0617 interupt

public class Main_0617 {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {});
        try {
            System.out.println("Working..");
            Thread.sleep(10_000);
            System.out.println("Completed.");
        }catch (InterruptedException e){
            System.out.println("정리 후 종료");
        }
    }
}
