//0616 inner class

public class Main_0616 {    //Button

    interface OnClickListener{      //interface
        void onClick();     //메서드명만 선언
    }

    private OnClickListener listener;   //private 객체

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;   //setter
    }

    public void click() {
        if(listener != null) {
            listener.onClick();
        }
    }

    private class ClickHandler implements OnClickListener { //private class
        @Override
        public void onClick() { //interface의 onClick 정의
            System.out.println("Button was clicked!");
        }
    }

    public void simulate() {
        setOnClickListener(new ClickHandler()); //새로운 객체를 인자로 전달
        click();    //click() 실행 -> .onClick() 실행
    }

    public static void main(String[] args) {
        Main_0616 button = new Main_0616();
        button.simulate();

    }
}