//0609 Strings

import java.lang.reflect.Array;

public class Main_0609 {
    public static void main(String[] args) {

        String mess = "Hello, Java!";
        System.out.println(mess.length());
        System.out.println(mess.toUpperCase());
        System.out.println(mess.toLowerCase());
        System.out.println(mess.indexOf("J"));

        for (int i = 0; i < mess.length(); i++) {
            if(mess.charAt(i) == 'l'){
                System.out.println("l은 " + (i+1) +"번째입니다");

            }
        }

        String address = "0x120819f5573ac3A530e6172b1581613A09b4b338";
        System.out.println(address.substring(0,7));
        System.out.println(address.substring(37,42));
        System.out.println(address.length());
        System.out.println(
                address.substring(0,7)
                + "..."
                + address.substring(address.length() - 5)
        );

        String greeting = "Hello, Alice!";
        greeting = greeting.toLowerCase();
        System.out.println(greeting);

    }
}
