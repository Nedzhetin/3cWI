package at.nedzhetin.OO_Programming.miniGame;

public class FireAbility implements SpecialAbility{

    @Override
    public void useAbility(Character enemy) {
        int fireDamage = 12;
        enemy.takeDamage(enemy.hp,fireDamage);
    }
}
