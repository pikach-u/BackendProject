//0618 Wordle

import java.util.Random;
import java.util.Scanner;

public class Wordle {

    private static final String[] WORD_LIST = {
            "APPLE", "BRAIN", "CRANE", "DREAM", "EAGLE",
            "FRAME", "GRACE", "HOUSE", "INPUT", "JUDGE"
    };

    private static final int MAX_ATTEMPTS = 6;
    private static final int WORD_LENGTH = 5;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String answer = pickRandonWord();
//        System.out.println(answer);

        // C - 알파벳 o, 자리 o
        // W - 알파벳 o, 자리 x
        // N - 알파벳 x, 자리 x

        System.out.println("=== Wordle 게임 ===");
        System.out.println("5글자 단어를 맞춰보세요. 총 6번의 기회가 있습니다.");
        System.out.println("C: 정확한 위치, W: 단어에는 있으나 위치 불일치, N: 단어에 없음");

        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
            String guess;

            while (true) {      // 이 안에서는 시도횟수 차감 X
                System.out.print("\n[" + attempt + "/" + MAX_ATTEMPTS + "] 추측> ");
                guess = scanner.nextLine().trim().toUpperCase();    //trim() 공백제거 //입력단어 대문자로 고정
                if (guess.length() == WORD_LENGTH) {
                    break;
                }
                System.out.println("5글자 단어를 입력하세요.");
            }

            Feedback fb = evaluateGuess(guess, answer);

            System.out.println(fb.getWordResultCheck());

            if (fb.isAllCorrect()) {
                System.out.println("🎉 정답입니다! " + attempt + "번 만에 맞추셨군요.");
                scanner.close();
                return;
            }
        }
    }

    public static String pickRandonWord() {
        Random rand = new Random();     //seed
        return WORD_LIST[rand.nextInt(0,9)];
    }

    private static class Feedback {
        private final char[] resultSymbols;

        Feedback(char[] resultSymbols) {
            this.resultSymbols = resultSymbols;
        }

        boolean isAllCorrect() {    // 정답인지 체크 CCCCC
            for (char c : resultSymbols) {
                if (c != 'C') {
                    return false;
                }
            }
            return true;
        }

        String getWordResultCheck() {   //문자열로 만들어주는 메서드
            StringBuilder sb = new StringBuilder();

            for (char c : resultSymbols) {
                sb.append(c);   //resultSymbols 배열을 순회하면서 문자를 StringBuilder에 붙임
            }

            return sb.toString();   //String으로 반환
        }
    }


    private static Feedback evaluateGuess(String guess, String answer) {
        char[] symbols = new char[WORD_LENGTH];
        int[] count = new int[26];

        for (char c : answer.toCharArray()) {
            count[c - 'A']++;
        }

        for (int i = 0; i < WORD_LENGTH; i++) {
            if (guess.charAt(i) == answer.charAt(i)) {  //값과 위치가 일치하는지
                symbols[i] = 'C';   //값도 맞고 위치도 맞음
                count[guess.charAt(i) - 'A']--;
            }
        }

        for (int i = 0; i < WORD_LENGTH; i++) {
            if (symbols[i] != 0) continue;

            char c = guess.charAt(i);

            if (count[c - 'A'] > 0) {   //문자가 단어에 있는데 순서가 안맞음
                symbols[i] = 'W';
            } else {    //없는 문자
                symbols[i] = 'N';
            }
        }

        return new Feedback(symbols);
    }


}
