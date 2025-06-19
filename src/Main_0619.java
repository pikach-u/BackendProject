//0619 Generic

import java.util.ArrayList;
import java.util.List;

public class Main_0619 {
    public static void main(String[] args) {
//        Object[] arr = new Integer[3];
//        arr[1] = "Hello";   //ArrayStoreException

//        List<Object> arr = new ArrayList<Integer>();    // X, 제네릭은 불공변
        List<? extends Number> arr = new ArrayList<Integer>();  //Wild Card를 통해 공변성 부여


    }
}
