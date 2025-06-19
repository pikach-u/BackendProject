//0619 Generic

class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public <E> void printContent(E extraInfo) {
        System.out.println("Content: " + content + ", Extra: " + extraInfo);
    }
}

public class Main_0619 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<String>("나는 훌륭한 박스가 될거야");

        System.out.println(stringBox.getContent());

        stringBox.setContent("실패");

        System.out.println(stringBox.getContent());

        stringBox.printContent(1234);
    }
}
