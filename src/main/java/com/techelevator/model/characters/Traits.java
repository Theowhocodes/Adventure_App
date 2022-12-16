package com.techelevator.model.characters;

public class Traits {
    private String index;
    private String name;

    public Traits(){}

    public Traits(String index, String name) {
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
}
