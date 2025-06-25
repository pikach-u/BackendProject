import java.util.*;

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

    public int getAge() { return age; }

    public String getPhoneNum() { return phoneNum; }

}

class ManagementSystem {

//    private final List<Member> memberList = new ArrayList<>();
    private final Map<String, Member> memberList = new HashMap<>();
    public void RegisterMember(Scanner scanner) {
        //예외처리 필요
        System.out.println("이름: "); //중복 가능
        String name = scanner.nextLine();

        System.out.println("나이: ");
        int age = scanner.nextInt();
        scanner.nextLine();     //buffer 제거

        System.out.println("전화번호: ");
        String phoneNum = scanner.nextLine();

        String id = null;

        do {
             id = UUID.randomUUID().toString().substring(0, 6);
        } while(memberList.containsKey(id));

        memberList.put(id, new Member(name, age, phoneNum));
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
        for (Member member : memberList.values()) {
            System.out.println(member);
        }

        //회원목록을 정렬 - 현재는 List 정렬. Map 정렬로 재구현 필요
//        memberList.sort((m1, m2) -> m1.getName().compareTo(m2.getName()));
        List<Member> sortList = new ArrayList<>(memberList.values());
        sortList.sort(Comparator.comparing(Member::getName));

//        for (Member member : sortList) {      // value만 출력
//            System.out.println(member);
//        }

        for (Map.Entry<String, Member> entry : memberList.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

    }
}

public class MemberManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagementSystem manager = new ManagementSystem();

        manager.RegisterMember(sc);
        manager.RegisterMember(sc);
        manager.printMembers();
    }
}
