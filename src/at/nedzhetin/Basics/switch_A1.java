import java.util.Random;

public class switch_A1 {
    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber1 = random.nextInt(6) + 5;
        System.out.println(randomNumber1);

        switch (randomNumber1){
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
                break;
            case 10:
                System.out.println("10");
                break;
        }
    }
}
