//0605 Ternary-Operators

public class Main_0605 {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;

        int max = (a > b) ? a : b;
        System.out.println(max);

        //if문으로 변환
//        int max = b;
//
//        if (a < b) {
//            max = b;
//        } else {
//            max = a;
//        }
//        System.out.println(max);

        int score = 61;
        String result = (score > 60) ? "통과" : "탈락";

        System.out.println("결과: " + result);

        //if문으로 변환
//        if (score > 60) {
//            result = "통과";
//        } else {
//            result = "탈락";
//        }
//
//        System.out.println("결과: " + result);

        // 삼항연산자를 중첩해서 쓰는 형태 - 권장X
        String color = "보라";
        String choiceColor = (color == "빨강") ? "빨강" : (color == "파랑") ? "파랑" : "보라";

        System.out.println(choiceColor);

        //if문으로 변환 - 중첩보다 if문 추천
//        if(color =="빨강") {
//            System.out.println("빨강");
//        } else if (color == "파랑") {
//            System.out.println("파랑");
//        } else{
//            System.out.println("보라");
//        }

    }
}
