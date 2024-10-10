import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WoerterRaten {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "cherry", "date", "elephant", "falcon", "guitar", "house", "island", "jungle",
                "kangaroo", "lemon", "mountain", "notebook", "ocean", "piano", "queen", "river", "sun", "tree",
                "umbrella", "vase", "whale", "xylophone", "yacht", "zebra", "ant", "ball", "cat", "dog",
                "eagle", "frog", "goat", "hat", "igloo", "jam", "kite", "lamp", "moon", "net",
                "owl", "pencil", "quilt", "ring", "snake", "tiger", "umbrella", "violet", "wolf", "x-ray"
        };
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isFinished = false;
        int randomNum = random.nextInt(words.length);
        List<String> foundLetters = new ArrayList<String>();

        while (!isFinished){


            String selectedLetter = scanner.next();

            if (containsLetter(words[randomNum],selectedLetter)){
                System.out.println("true");
                foundLetters.add(selectedLetter);
            }
            printHiddenWord(words[randomNum],foundLetters);


        }


    }

    public static boolean containsLetter(String word, String letter){
        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) == letter.charAt(0)){
                return true;
            }

        }
        return false;
    }

    public static void printHiddenWord(String word, List<String> foundLetters) {
        for (int i = 0; i < word.length(); i++) {
            String currentLetter = String.valueOf(word.charAt(i));
            if (foundLetters.contains(currentLetter)) {
                System.out.print(currentLetter); // Print the letter if it has been guessed
            } else {
                System.out.print("_"); // Print an underscore if the letter hasn't been guessed
            }
            System.out.print(" "); // Add space for better readability
        }
        System.out.println(); // Move to the next line after printing the word
    }
}
