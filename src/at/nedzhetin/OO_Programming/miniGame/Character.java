package at.nedzhetin.OO_Programming.miniGame;

public class Character {
    private final String name;
    private final int age;
    private final String gender;
    private final String description;
    private final String specialty;
    public  int hp;
    SpecialAbility ability;
    Weapon weapon;

    public Character(String name, int age, String gender, String description, String specialty, int hp, SpecialAbility ability,Weapon weapon) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.description = description;
        this.specialty = specialty;
        this.hp = hp;
        this.ability = ability;
        this.weapon = weapon;
    }

    public void display() {
        System.out.println("Name:\t\t\t" + name);
        System.out.println("Age:\t\t\t" + age);
        System.out.println("Gender:\t\t\t" + gender);
        System.out.println("Description:\t" + description);
        System.out.println("Specialty:\t\t" + specialty);
        System.out.println("HP:\t\t\t\t" + hp+ "\n");

    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void displayHp(){
        System.out.print("HP:\t" + hp);
    }

    public void takeDamage(int hp,int damage) {
        this.hp = this.hp-damage;
    }

    public void heal(){
        this.hp = this.hp+10;
    }

    @Override
    public String toString() {
        return "name" + name;
    }
}
