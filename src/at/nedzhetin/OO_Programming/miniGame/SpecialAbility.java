package at.nedzhetin.OO_Programming.miniGame;

public class SpecialAbility {
   private String abilityName;
  private int abilityDamage;

  public SpecialAbility(String abilityName, int abilityDamage) {
      this.abilityName = abilityName;
      this.abilityDamage = abilityDamage;
  }

    public int getAbilityDamage() {
        return abilityDamage;
    }

    public String getAbilityName() {
        return abilityName;
    }

    public void useAbility(Character enemy) {
        enemy.takeDamage(enemy.hp,abilityDamage);
    }

}
