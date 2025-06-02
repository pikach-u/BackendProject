//0602 Conditional-Statement-If

public class Main_0602 {
    public static void main(String[] args) {
        // if-else
        int num = -1;

        if(num > 0) {
            System.out.println("number는 0보다 큽니다");
        }
        else{
            System.out.println("number는 0이거나 0보다 작습니다.");
        }

        //if-else if-else
        num = 5;

        if(num > 0) {
            System.out.println("number는 0보다 큽니다");
        } else if (num < 0) {
            System.out.println("number는 0보다 작습니다");
        } else{
            System.out.println("number는 0보다 같습니다");
        }


        //if-else if
        num = -1;
        if (num > 0) {
            System.out.println("number는 양수입니다.");
        }
        else if (num < 0) {
            System.out.println("number는 음수입니다.");
        }


    }
}
