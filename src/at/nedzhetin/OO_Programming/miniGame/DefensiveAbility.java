package at.nedzhetin.OO_Programming.miniGame;

public class DefensiveAbility extends SpecialAbility{
    private String description;

    public DefensiveAbility(String abilityName,String info) {
        super(abilityName,info);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public void useAbility(Character enemy) {
       enemy.weapon.setNerfDuration(1); //he is immune for 2 rounds (always 1 less)
    }


}
