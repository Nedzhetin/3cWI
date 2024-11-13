package at.nedzhetin.OO_Programming.miniGame;

public class Weapon {
    private String name;
    private int damage;
    public String type;
    private int damageBuff;

    public Weapon(String name, int damage, String type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public void display(){
        System.out.println("Name:\t\t" + name);
        System.out.println("Damage:\t\t" + damage);
        System.out.println("Type:\t\t" + type+ "\n");
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }


    public void displayBuffs(Character character){
        if (this.type.equals(character.getSpecialty())){
            this.damageBuff = 5;
            this.damage = this.damage + this.damageBuff;
            System.out.println("Buffs:\t\t" +this.damageBuff + " more Damage" );
        }


    }

    public void useWeapon(Character enemy) {
        enemy.takeDamage(enemy.hp, this.damage);
    }
}
