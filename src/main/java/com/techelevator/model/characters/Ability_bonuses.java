package com.techelevator.model.characters;

public class Ability_bonuses {

    private Ability_score [] ability_scores;
    private int bonus;

    public Ability_bonuses(){}

    public Ability_bonuses(Ability_score[] ability_scores, int bonus) {
        this.ability_scores = ability_scores;
        this.bonus = bonus;
    }

    public Ability_score[] getAbility_scores() {
        return ability_scores;
    }

    public void setAbility_scores(Ability_score[] ability_scores) {
        this.ability_scores = ability_scores;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
