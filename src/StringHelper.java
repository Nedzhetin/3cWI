import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;

        while (!isFinished) {

            System.out.println("1. IsPalindrone");
            System.out.println("2. CountLetters");
            System.out.println("3. reverseString");
            System.out.println("4. PrintAmoutOfLetters");
            int selection = scanner.nextInt();


            if (selection == 2) {
                String word = scanner.next();
                System.out.println(countLetters(word));
            }

            if (selection == 3) {
                String word = scanner.next();
                System.out.println(reverseString(word));
            }

            if (selection == 4) {
                String word = scanner.next();
                System.out.println(printAmoutOfLetters(word));
            }

        }

    }

    public static int countLetters(String word) {

        return word.length();
    }

    public static String reverseString(String word) {
        String rvsWord = "";
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            rvsWord = ch + rvsWord;

        }
        return rvsWord;
    }

    public static String printAmoutOfLetters(String word) {
        char ch;
        List letters = new ArrayList();
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            letters.add(ch);
            System.out.println(ch + ":");

        }
        System.out.println(letters);
        return "";
    }
}
