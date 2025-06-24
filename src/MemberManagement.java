import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Member {
    private final String name;
    private final int age;
    private final String phoneNum;
    private int memberNum;

    public Member(String name, int age, String phoneNum) {
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {   //객체를 출력하기 위해 toString() 메서드 오버라이딩

        return String.format("[%s] 이름: %s\t나이: %d\t전화번호: %s",
                this.getClass().getSimpleName(), name, age, phoneNum);
        //010-xxxx-xxxx
    }


    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }


}

class registerManager {

    private final List<Member> memberList = new ArrayList<>();

    public void RegisterMember(Scanner scanner) {
        //예외처리 필요
        System.out.println("이름: ");
        String name = scanner.nextLine();

        System.out.println("나이: ");
        int age = scanner.nextInt();
        scanner.nextLine();     //buffer 제거

        System.out.println("전화번호: ");
        String phoneNum = scanner.nextLine();

        memberList.add(new Member(name, age, phoneNum));
        System.out.println(name + "님 등록이 완료되었습니다.");

    }

    public void removeMember(Scanner scanner) {
        //List 안의 멤버 삭제
    }

    public void printMembers() {

        if (memberList.isEmpty()) {
            System.out.println("회원 목록이 비어있습니다.");
            return;
        }
        for (Member member : memberList) {
            System.out.println(member);
        }
    }
}

public class MemberManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        registerManager manager = new registerManager();

        manager.RegisterMember(sc);
        manager.printMembers();
    }
}
