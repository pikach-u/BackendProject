//0623 Annotation_Reflection

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ReflectionDemo {
    public String noSecret = "No Secret";
    private String secret = "Secret";

    public ReflectionDemo() {
        System.out.println(secret);
    }

    public String greet(String name) {
        return "Hello " + name;
    }

    private String reveal(String code) {
        return "Access Granted to: " + code;
    }
}

public class Main_0623 {
    public static void main(String[] args) {
//        ReflectionDemo reflectionDemo = new ReflectionDemo();
        Class<?> clazz = ReflectionDemo.class;
        System.out.println("Class name: " + clazz.getName());
        System.out.println("\n[필드 목록]");

        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            System.out.println("필드: " + field.getName());
        }

        System.out.println("\n[메서드 목록]");
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods){
            System.out.println("메서드: " + method.getName());
            for(Class<?> paramType:method.getParameterTypes()){
                System.out.println("파라미터 타입: " + paramType.getSimpleName());
            }
        }

        try {   //예외처리 필수
            Object instance = clazz.getDeclaredConstructor().newInstance();

            Method greetMethod = clazz.getMethod("greet" , String.class);
            Object greetResult = greetMethod.invoke(instance, "pikachu");
            System.out.println("\n [퍼블릭 메서드 실행 결과]");
            System.out.println("greet(): " + greetResult);

            Method revealMethod = clazz.getDeclaredMethod("reveal", String.class);
            revealMethod.setAccessible(true);   //접근제어
            Object revealResult = revealMethod.invoke(instance, "pikachu");
            System.out.println("\n [프라이빗 메서드 실행 결과]");
            System.out.println("reveal(): " + revealResult);

        } catch (Exception e) {
            e.printStackTrace();;
        }

    }
}
