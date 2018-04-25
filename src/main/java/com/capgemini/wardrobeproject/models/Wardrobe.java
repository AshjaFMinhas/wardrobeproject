package com.capgemini.wardrobeproject.models;

public class Wardrobe {
    private String name;
    boolean openWardrobe = true;                //Is de wardrobe open of niet?
    boolean outWardrobe = true;                 //Kan je uit de wardrobe of niet komen?

    public Wardrobe() {
    }

    public Wardrobe(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpenWardrobe() {
        return openWardrobe;
    }

    public void setOpenWardrobe(boolean openWardrobe) {
        this.openWardrobe = openWardrobe;
    }

    public boolean isOutWardrobe() {
        return outWardrobe;
    }

    public void setOutWardrobe(boolean outWardrobe) {
        this.outWardrobe = outWardrobe;
    }
}

