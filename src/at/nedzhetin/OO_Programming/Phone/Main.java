package at.nedzhetin.OO_Programming.Phone;


public class Main {
    public static void main(String[] args) {

        Sim sim = new Sim(100,12346794);
        Camera cemara = new Camera("144p");
        SDCard sdCard = new SDCard(100);

        Phone phone = new Phone(sim,sdCard,cemara);


    }

}


