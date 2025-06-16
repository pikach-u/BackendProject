//0616 OuterInMemory

class Outer {
    static class StaticInner {
        void hello() {
            System.out.println("hi");
        }
    }
}


public class Main_0616 {    //Outter
    public static void main(String[] args) {
        Outer.StaticInner inner = new Outer.StaticInner();   //static을 이용해서 사용하기
        inner.hello();
    }
}