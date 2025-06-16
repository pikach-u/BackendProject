//0616 NullPointerException

public class Main_0616 {    //Outter
    private String data = "Outer data";

    class Inner {
        void printData() {
            System.out.println(data);
        }
    }

    public Inner createInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Main_0616 outer = new Main_0616();
        //Outer.this
        Main_0616.Inner inner = outer.createInner();

        inner.printData();

        outer = null;

        inner.printData();

        inner = null;

        System.gc();
    }
}