//0623 Annotation_Reflection

public class Main_0623 {
    @SuppressWarnings("rawtypes")   //경고 무시
    public static void main(String[] args) {
        java.util.List list = new java.util.ArrayList<>();
        list.add("Hello");
        list.add("World");

        for(Object obj : list){
            System.out.println(obj);
        }
    }
}
