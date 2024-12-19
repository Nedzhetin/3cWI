package at.nedzhetin.OO_Programming.Phone;

public class Sim {
    private int id;
    private int number;

    public Sim(int id, int number) {
        this.id = id;
        this.number = number;
    }

    public void doCall(){
        System.out.println("Your are calling someone right know");
    }

}
