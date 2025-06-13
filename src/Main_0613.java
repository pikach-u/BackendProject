//0613 getter-setter

class ReadOnlyStudent {
    private final int score;

    public ReadOnlyStudent(int score) {
        this.score = score;
    }

    public int getScore(){
        return score;
    }
}

public class Main_0613 {
    public static void main(String[] args) {
        ReadOnlyStudent ros = new ReadOnlyStudent(99);
        System.out.println(ros.getScore());

    }
}
