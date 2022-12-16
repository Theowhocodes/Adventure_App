package com.techelevator.model.characters;


public class Starting_proficiencies {
    private String index;
    private String name;

    public Starting_proficiencies(){}

    public Starting_proficiencies(String index, String name) {
        this.index = index;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Starting_proficiencies{" +
                "index= " + index +
                "\n name= " + name
                ;
    }
}
