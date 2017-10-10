package com.ironyard.day_care_project.Entity;

public class ItemNeeded {

    private boolean wipes;
    private boolean diapers;
    private boolean clothes;

    public ItemNeeded() {
    }

    public ItemNeeded(boolean wipes, boolean diapers, boolean clothes) {
        this.wipes = wipes;
        this.diapers = diapers;
        this.clothes = clothes;
    }

    public boolean isWipes() {
        return wipes;
    }

    public void setWipes(boolean wipes) {
        this.wipes = wipes;
    }

    public boolean isDiapers() {
        return diapers;
    }

    public void setDiapers(boolean diapers) {
        this.diapers = diapers;
    }

    public boolean isClothes() {
        return clothes;
    }

    public void setClothes(boolean clothes) {
        this.clothes = clothes;
    }
}
