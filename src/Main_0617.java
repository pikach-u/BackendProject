//0617 Method reference

import java.lang.reflect.Array;
import java.util.Arrays;


public class Main_0617 {
    public static void main(String[] args) {
        String[] name = {"홍성현", "김백기", "강윤정", "고종우"};
        for(String n : name){
            System.out.println(n);
        }
        Arrays.stream(name).forEach(nn -> System.out.println(nn));
        Arrays.stream(name).forEach(System.out::println);

    }
}
