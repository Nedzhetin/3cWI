package at.nedzhetin.OO_Programming.miniGame;

public class SpecialAbility {
   private String abilityName;
   private String info;


  public SpecialAbility(String abilityName, String info) {
      this.abilityName = abilityName;
      this.info = info;
  }


    public String getAbilityName() {
        return abilityName;
    }

    public String getInfo() {
      return info;
    }

    public void useAbility(Character enemy) {
        System.out.println("hello");
    }


}
