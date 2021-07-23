package cn.viewshine.starbuzz.correct;

import javax.swing.*;

public abstract class Beverage {
    public static int TALL = 1;
    public static int GRANDE = 2;
    public static int VENTI = 3;
    private int size;
    protected String description;
    public String getDescription() {
        return description;
    }
    public abstract float cost();
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
