//0610 package

package org.example;

import org.example.animal.Person;
import org.exampleB.Helper;


public class Main_0610 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome");

        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        Person person = new Person();
        person.name = "doraemong";
        person.age = 32;
        person.hello();


        //1. 동일 디렉토리
        Helper helper = new Helper();
        System.out.println(helper.helper);

        //4. 다른 패키지, 디폴트 클래스
        //helper를 exampleB로 이동



    }
}
