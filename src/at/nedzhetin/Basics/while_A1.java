import java.util.Random;

public class while_A1 {
    public static void main(String[] args) {


        boolean isFinished = false;
        int summe = 0;

        while (!isFinished){
            Random random = new Random();

            int randomNumber1 = random.nextInt(21) + 10;
            summe += randomNumber1;
            System.out.println(randomNumber1);

            if (randomNumber1 == 15 || randomNumber1 == 25){
                System.out.println(summe);
                isFinished = true;

            }
        }
        // xx
    }
}
