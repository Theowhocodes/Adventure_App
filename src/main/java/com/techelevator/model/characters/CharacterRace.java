package com.techelevator.model.characters;

import com.techelevator.services.DnDServices;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CharacterRace {

    private String index;
    private String name;
    private int speed;
    private Ability_bonuses[] ability_bonuses;
    private String alignment;
    private String age;
    private String size;
    private String size_description;
    private int x= 0;
    private Starting_proficiencies[] starting_proficiencies = new Starting_proficiencies[x];
    private String language_desc;
    private Traits [] traits;
    private Sub_Races[] sub_races;





    //Constructors
    public CharacterRace(){}

    public CharacterRace(String index, String name, int speed, Ability_bonuses[] ability_bonuses, String alignment, String age, String size, String size_description, Starting_proficiencies[] starting_proficiencies, String language_desc, Traits[] traits, Sub_Races[] sub_races) {
        this.index = index;
        this.name = name;
        this.speed = speed;
        this.ability_bonuses = getAbility_bonuses();
        this.alignment = alignment;
        this.age = age;
        this.size = size;
        this.size_description = size_description;
        this.starting_proficiencies = starting_proficiencies;
        this.language_desc = language_desc;
        this.traits = traits;
        this.sub_races = sub_races;
    }

    // Getters and Setters
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Ability_bonuses[] getAbility_bonuses() {
        return ability_bonuses;
    }

    public void setAbility_bonuses(Ability_bonuses[] ability_bonuses) {
        this.ability_bonuses = ability_bonuses;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize_description() {
        return size_description;
    }

    public void setSize_description(String size_description) {
        this.size_description = size_description;
    }

    public Starting_proficiencies[] getStarting_proficiencies() {
        return starting_proficiencies;
    }

    public void setStarting_proficiencies(Starting_proficiencies[] starting_proficiencies) {
        this.starting_proficiencies = starting_proficiencies;
    }

    public String getLanguage_desc() {
        return language_desc;
    }

    public void setLanguage_desc(String language_desc) {
        this.language_desc = language_desc;
    }

    public Traits[] getTraits() {
        return traits;
    }

    public void setTraits(Traits[] traits) {
        this.traits = traits;
    }

    public Sub_Races[] getSub_races() {
        return sub_races;
    }

    public void setSub_races(Sub_Races[] sub_races) {
        this.sub_races = sub_races;
    }

    public String toString() {
        return "\n---------------------------------------------" +
                "\n Race Details" +
                "\n--------------------------------------------" +
                "\n Name: " + name +
                "\n Speed: " + speed +
                "\n Age: " + age +
                "\n Size: " + size +
                "\n Size Description: " + size_description +
                "\n Language Description: " + language_desc +
                "\n Sub-races: " + Arrays.toString(sub_races) +
                "\n Ability bonuses: " + Arrays.toString(ability_bonuses)
                ;
    }

  /*  public String arrayToString(){

        for(Starting_proficiencies proficiency: proficiencies){
            System.out.println(proficiency);
        }
      return null;
    }
*/
    public String toString2(){
        return "\n---------------------------------------------" +
                "\n Race Details" +
                "\n--------------------------------------------" +
                "\n Name: " + name;
    }
}
