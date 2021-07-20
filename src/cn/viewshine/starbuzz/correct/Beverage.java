package cn.viewshine.starbuzz.correct;

import javax.swing.*;

public abstract class Beverage {
    protected String description;
    public String getDescription() {
        return description;
    }
    public abstract float cost();
}
