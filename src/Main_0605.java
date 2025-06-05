//0605 Function

public class Main_0605 {
    public static void printStudent(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("------------");
    }

    public static void main(String[] args) {
        System.out.println("=== 학생 정보 출력 ===");
        Main_0605.printStudent("Alice", 20);
        printStudent("Bob", 22);    //같은 클래스 내에 있어서 생략가능
        printStudent("Charlie", 25);
    }
}
