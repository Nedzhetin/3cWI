import java.util.Scanner;

public class WoerterRaten {
    public static void main(String[] args) {
        String[] words = {"auto","haus","fernsehen"};
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;

        while (!isFinished){

            System.out.println(words[0]);
            String selectedLetter = scanner.next();

            for (int i = 0; i < words[0].length() ; i++) {
                if (words[0].charAt(i) == selectedLetter.charAt(0)){
                    System.out.println("same letter");
                }else{
                    System.out.println("False");
                }

            }

        }



    }
}
