package com.techelevator.model.characters;

public class Sub_Races {
    //instance variables
    private String index;
    private String name;

    //constructors
    public Sub_Races(){}

    public Sub_Races(String index, String name) {
        this.index = index;
        this.name = name;
    }

    //Getters/Setters
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
}
