package at.nedzhetin.OO_Programming.miniGame;

public class Weapon {
    private final String name;
    private int damage;
    public String type;
    private int damageBuff;

    public Weapon(String name, int damage, String type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public void display() {
        System.out.println("Name:\t\t" + name);
        System.out.println("Damage:\t\t" + damage);
        System.out.println("Type:\t\t" + type + "\n");
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }


    public int displayBuffs(Character character) {
        if (this.type.equals(character.getSpecialty())) {
            if (this.type == "fire") {
                return 20; // because fire will always buff 20%
            }
            else if (this.type == "ice") {
                return 30;

            }
        }
       return 0;
    }


    public void buffWeapon(Character character){
        if (this.type.equals(character.getSpecialty())){
            if(this.type == "fire"){
                this.damageBuff =(int) Math.round(this.damage * 0.2);
            } else if (this.type == "ice") {
                this.damageBuff = (int) Math.round(this.damage * 0.3);
            }

            this.damage = this.damage + this.damageBuff;
        }
    }

    public void useWeapon(Character enemy) {
        enemy.takeDamage(enemy.hp, this.damage);
    }
}
