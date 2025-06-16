//0616 OuterInMemory

public class Main_0616 {    //Outter
    private String data = "Outer data";

    class Inner{
        void printData(){
            System.out.println(data);
        }
    }

    public Inner createInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Main_0616 outer = new Main_0616();
        Main_0616.Inner inner = outer.createInner();

        inner.printData();

    }
}