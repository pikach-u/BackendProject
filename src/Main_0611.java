//0611 Print-Methods

public class Main_0611 {
    public static void main(String[] args) {
        String name = "Kim";
        int num = 10;
        double pi = 3.14159;


        //타입 확인
        System.out.println((name + num).getClass().getName());
        System.out.println(((Object) num).getClass().getName());

        System.out.println("\"안녕하세요.\"");
        System.out.println("이름:\tAlice");
        System.out.println("\\\\");

        System.out.printf("나이: %d, 원주율: %.2f\n", num, pi);

        int fineDust = 23;
        double ozone = 0.051;
        System.out.printf("미세먼지: %d, 오존: %.3f", fineDust, ozone);

    }
}
