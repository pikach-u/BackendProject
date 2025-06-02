//0602 Switch

public class Main_0602 {
    public static void main(String[] args) {
        // "happy", "angry", "sad", etc.
        String mood = "angry";

        switch(mood){
            case "happy":
                System.out.println("행복합니다");
                break;      //여러 case를 묶어서 처리하는 경우는 break 생략
            case "tired":
                System.out.println("피곤합니다");
                break;
            case "angry":
                System.out.println("화납니다");
                break;
            default:
                System.out.println("표현할 수 없습니다");

        }

    }
}
