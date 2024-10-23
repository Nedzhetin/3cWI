import java.util.*;

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


            if (selection == 1) {
                String word = scanner.next();
                System.out.println(isPalindrone(word));
            }

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
                System.out.println(printAmountOfLetters(word));
            }

        }

    }

    public static boolean isPalindrone(String word) {
        List<Character> letters = new ArrayList<>();
        char ch;
        String rvsWord = "";

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            rvsWord = ch + rvsWord;
        }
        System.out.println(rvsWord);

        if (word.equals(rvsWord)) {
            return true;
        }else {
            return false;
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

    public static String printAmountOfLetters(String word) {
        List<Character> letters = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();



        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = letters.indexOf(ch);


            if (index != -1) {
                counts.set(index, counts.get(index) + 1);
            } else {

                letters.add(ch);
                counts.add(1);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < letters.size(); i++) {
            result.append(letters.get(i)).append(": ").append(counts.get(i)).append(", \n");
        }


        //System.out.println(counts);
        return result.toString();
    }
}
