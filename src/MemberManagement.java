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

        return String.format("[%s] 이름: %s   나이: %d   전화번호: %s",
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

class ManagementSystem {

    //    private final List<Member> memberList = new ArrayList<>();
    private final List<Member> memberList = new ArrayList<>();

    public void RegisterMember(Scanner scanner) {
        //예외처리 필요
        while(true) {
            System.out.println("이름: "); //중복 가능
            String name = scanner.nextLine();

            int age = 0;
            try {
                System.out.println("나이: ");
                age = scanner.nextInt();    //예외처리 필요
                scanner.nextLine();     //buffer 제거

            } catch (NumberFormatException e) {
                System.out.println("숫자로 입력해주세요.");
                throw new RuntimeException(e);
            }

            System.out.println("전화번호: ");
            String phoneNum = scanner.nextLine();

            //Map 변경 시 추가 예정
//            String id = null;
//
//            do {
//                id = UUID.randomUUID().toString().substring(0, 6);
//            } while (memberList.containsKey(id));
//
//            memberList.put(id, new Member(name, age, phoneNum));
            memberList.add(new Member(name, age, phoneNum));
            System.out.println(name + "님 등록이 완료되었습니다.");
            System.out.println("계속 등록하시겠습니까?");
            System.out.println("1.예  / 2.아니오");
            int input = scanner.nextInt();
            scanner.nextLine();
            if(input == 1) {
                continue;
            } else if (input == 2) break;
        }

    }

    public void removeMember (String deleteMember){
        //List 안의 멤버 삭제
        memberList.removeIf(member -> member.getName().equals(deleteMember));

        System.out.println(deleteMember +"님의 정보가 삭제되었습니다.");
    }

    public void printMembers () {

        if (memberList.isEmpty()) {
            System.out.println("회원 목록이 비어있습니다.");
            return;
        }

        //회원목록을 정렬 - 현재는 List 정렬. Map 정렬로 재구현 필요
//        memberList.sort((m1, m2) -> m1.getName().compareTo(m2.getName()));
        memberList.sort(Comparator.comparing(Member::getName));
        for (Member member : memberList) {      // value만 출력
            System.out.println(member);
        }

//            for (Map.Entry<String, Member> entry : memberList.entrySet()) {
//                System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
//            }

    }

    }

    public class MemberManagement {

        public static void printMenu(){
            System.out.println("----------< 회원 등록 프로그램 >----------");
            System.out.println("--------원하는 메뉴를 선택해주세요---------");
            System.out.println("1. 신규 회원 등록");
            System.out.println("2. 회원 목록 모두 보기");
            System.out.println("3. 회원 삭제");
            System.out.println("0. 프로그램 종료");

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ManagementSystem manager = new ManagementSystem();
            String deleteMember = null;

            while (true) {
                printMenu();

                int input = sc.nextInt();
                sc.nextLine();

                switch (input) {
                    case 1:
                        manager.RegisterMember(sc);
                        break;
                    case 2:
                        manager.printMembers();
                        break;
                    case 3:
                        System.out.println("삭제할 회원명을 입력해주세요.");
                        deleteMember = sc.nextLine();
                        manager.removeMember(deleteMember);
                        break;
                    case 0:
                        System.out.println("프로그램을 종료합니다.");
                        sc.close();
                        return;
                    default:
                        System.out.println("다시 입력해주세요.");
                }
            }
        }
    }
