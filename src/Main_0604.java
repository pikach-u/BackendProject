//0604 Logical-Operator

public class Main_0604 {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18 && hasID){
            System.out.println("True");
        }

        boolean isWeekend = false;
        boolean isHoliday = true;

        if (isWeekend || isHoliday) {
            System.out.println("쉴 수 있습니다");
        }

        boolean isRaining = true;
        if(!isRaining){
            System.out.println("sunny day");
        }
        else{
            System.out.println("Rainy day");
        }


    }
}
