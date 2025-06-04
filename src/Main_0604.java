//0604 While

public class Main_0604 {
    public static void main(String[] args) {
        int num = 12144523;

        String binaryString = Integer.toBinaryString(num);  //이진수로 변환
        String hexaString = Integer.toHexString(num);

        System.out.println("Decimal: " + num);
        System.out.println("Binary: " + binaryString);
        System.out.println("Hexa: " + hexaString);
    }
}
