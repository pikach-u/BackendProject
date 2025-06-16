//0616 inner class

public class Main_0616 {    //Outer

    private String mess = "Hello from the outer class.";

    class InnerClass{
        void displayMessage(){
            System.out.println("Inner say: " + mess);
        }
    }

    public void callInner(){
        InnerClass inner = new InnerClass();
        inner.displayMessage();
    }

    public static void main(String[] args){
        Main_0616 outer = new Main_0616();
        outer.callInner();
    }
}
