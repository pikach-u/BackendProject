//0616 inner class

class Outer {

    String outerMessage = "Hello from Outer";

    private class Inner {   //오류!
        void showMessage() {
            System.out.println(outerMessage);
        }
    }
}

public class Main_0616 {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();   //private은 접근x!!

        inner.showMessage();

    }
}