package at.nedzhetin.OO_Programming.miniGame;

public class OffensiveAbility extends SpecialAbility {
    private int abilityDamage;
    public OffensiveAbility(String abilityName,String info, int abilityDamage) {
        super(abilityName,info);
    this.abilityDamage = abilityDamage;

    }
    @Override
    public void useAbility(Character enemy) {
        enemy.takeDamage(enemy.hp,abilityDamage);
    }


}
