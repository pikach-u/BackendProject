import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pokemon {
    private String type;
    private String name;
    private int hp;
    private int attack;

    public Pokemon(String name, String type, int hp, int atk) {   //constructor
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attack = atk;
    }
    
    @Override
    public String toString() {
        return String.format("[%s] 이름: %s / 타입: %s / HP: %d / 공격력: %d",
                this.getClass().getSimpleName(), name, type, hp, attack);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack; // 여기!
    }


}


class PokemonManager {
    private List<Pokemon> pokemonList = new ArrayList<>();

//    public PokemonManager() {
//
//    }

    public void registerPokemon(Scanner scanner) {  //포켓몬 등록
        System.out.println("이름: ");     //!!중복을 체크할지?
        String name = scanner.nextLine();   //공백 등 이상한 이름 처리

        System.out.println("타입: ");     //!!타입 오타방지를 위해 Enum으로 관리
        String type = scanner.nextLine();

        System.out.println("체력(hp): ");
        int hp = scanner.nextInt();     //!!문자열 입력시 터짐
                                        //!!음수 입력 처리

        System.out.println("공격력: ");
        int atk = scanner.nextInt();
        scanner.nextLine();     //buffer 제거

        pokemonList.add(new Pokemon(name, type, hp, atk));      //Map으로 관리: 검색 성능 up, 중복 방지 가능
        System.out.println(name + " 등록 완료!");

    }

    public void removePokemon(Scanner scanner){
        // !!Collection에 저장된 포켓몬 제거
    }

    public void typeCalculate(){
        //상성 계산
    }

    public void printAll() {        //List에 저장된 포켓몬을 저장된 순서대로 출력
        if (pokemonList.isEmpty()) {
            System.out.println("등록된 포켓몬이 없습니다");
            return;
        }

        for (int i = 0; i < pokemonList.size(); i++) {
            System.out.println((i + 1) + ". " + pokemonList.get(i));        //override 해두면 자동으로 객체의 toString() 호출
        }                                                                   //get(i).toString()으로 동작

    }

    public Pokemon findByName(String name) {
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getName().equals(name)) {
                return pokemon;
            }
        }
        return null;
    }

    public void battle(Pokemon p1, Pokemon p2) {
        System.out.println("\n-- 배틀 시작 --");

        int hp1 = p1.getHp();
        int hp2 = p2.getHp();

        while (hp1 > 0 && hp2 > 0) {        //!!Critical 난수 추가
            hp2 -= p1.getAttack();
            System.out.printf("%s 공격 → %s 체력: %d\n", p1.getName(), p2.getName(), Math.max(hp2, 0));
            if (hp2 <= 0) break;

            hp1 -= p2.getAttack();
            System.out.printf("%s 공격 → %s 체력: %d\n", p2.getName(), p1.getName(), Math.max(hp1, 0));
//                if (hp1 <= 0) break;
        }

        if (hp1 > 0) {
            System.out.println("\n🎉 승자: " + p1.getName());
        } else {
            System.out.println("\n🎉 승자: " + p2.getName());
        }

    }
}


public class PokemonSimulator {

    public static void printMenu() {
        System.out.println("\n=== 포켓몬 게임 ===");
        System.out.println("1. 포켓몬 등록");
        System.out.println("2. 내 포켓몬 목록 보기");
        System.out.println("3. 포켓몬 이름으로 검색");
        System.out.println("4. 포켓몬 배틀");
        System.out.println("0. 종료");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //PokemonSimulator simulator = new PokemonSimulator();
        //PokemonManager manager = simulator.new PokemonManager();
        PokemonManager manager = new PokemonManager();

        while (true) {
            printMenu();

            int input = sc.nextInt();
            sc.nextLine();     //nextInt() 뒤에는 buffer 비워줘야 함

            switch (input) {     //메서드로 분리
                case 1:
                    manager.registerPokemon(sc);
                    break;
                case 2:
                    manager.printAll();
                    break;
                case 3:
                    System.out.println("검색할 포켓몬 이름: ");
                    String name = sc.nextLine();
                    Pokemon found = manager.findByName(name);
                    if (found != null) {
                        System.out.println("결과: " + found);
                    } else {
                        System.out.println("존재하지 않습니다.");
                    }
                    break;
                case 4:
                    System.out.println("첫 번째 포켓몬의 이름: ");
                    String name1 = sc.nextLine();
                    System.out.println("두 번째 포켓몬의 이름: ");
                    String name2 = sc.nextLine();

                    Pokemon p1 = manager.findByName(name1);
                    Pokemon p2 = manager.findByName(name2);

                    if (p1 != null && p2 != null) {
                        manager.battle(p1, p2);
                    } else {
                        System.out.println("입력한 포켓몬이 존재하지 않습니다.");
                        System.out.println("Player1: " + (p1 != null ? p1.getName() : "없음"));
                        System.out.println("Player2: " + (p2 != null ? p2.getName() : "없음"));
                    }
                    break;
                case 0:
                    System.out.println("게임을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("다시 입력해주세요.");
            }
        }

    }

}
