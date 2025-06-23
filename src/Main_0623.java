//0623 Annotation_Reflection

import java.awt.*;

class Calculatorr {
    /** javadoc
     *
     * @deprecated Use {@link #addNum(int, int)} instead.
     */
    @Deprecated     //경고. 더이상 사용하지 않는 메서드나 클래스
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * 두 수를 더합니다.
     *
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @return 두 수의 합
     */

    public int addNum(int a, int b) {
        return a + b;
    }
}

public class Main_0623 {
    public static void main(String[] args) {
        Calculatorr calculatorr = new Calculatorr();
        System.out.println(calculatorr.add(1, 2));
        System.out.println(calculatorr.addNum(2, 4));
    }
}
