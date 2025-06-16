//0616 inner class

public class Main_0616 {

    String outerMessage = "Hello from Outer";

    class Inner{
        void showMessage(){
            System.out.println(outerMessage);
        }
    }
    public static void main(String[] args) {
        Main_0616 main = new Main_0616();
        Main_0616.Inner inner = main.new Inner();   //오..

        inner.showMessage();

    }
}